package SOF304_ASM1;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class NguoiHocTest {
	NguoiHoc nguoiHoc;

	@Before
	public void setUp() throws Exception {
		nguoiHoc = new NguoiHoc();
	}

	@After
	public void tearDown() throws Exception {
		nguoiHoc = null;
	}

	private NguoiHoc createTestSubject() {
		return new NguoiHoc();
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

//	-------------------------------------------------

	// Test MaNH
	@Test
	public void testMaNHNull() throws Exception {
		String MaNH = null;
		exception.expect(IllegalArgumentException.class);
		nguoiHoc.setMaNH(MaNH);
	}

	// Test MaNH
	@Test
	public void testMaNHRong() throws Exception {
		String MaNH = "";
		try {
			nguoiHoc.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHNgan() throws Exception {
		String MaNH = "1234";
		try {
			nguoiHoc.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHDai() throws Exception {
		String MaNH = "1234512345123451";
		try {
			nguoiHoc.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHSai() throws Exception {
		String MaNH = "Hieubq@";
		try {
			nguoiHoc.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHDung() throws Exception {
		String MaNH = "hieubq";
		nguoiHoc.setMaNH(MaNH);
		assertEquals("hieubq", nguoiHoc.getMaNH());
	}

//		---------------------------------------------------------

	// Test HoTen
	@Test
	public void testHoTenNull() throws Exception {
		String HoTen = null;
		exception.expect(IllegalArgumentException.class);
		nguoiHoc.setHoTen(HoTen);
	}

	// Test HoTen
	@Test
	public void testHoTenRong() throws Exception {
		String HoTen = "";
		try {
			nguoiHoc.setHoTen(HoTen);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("hoTen không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test HoTen
	@Test
	public void testHoTenNgan() throws Exception {
		String HoTen = "Hi";
		try {
			nguoiHoc.setHoTen(HoTen);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("hoTen 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test HoTen
	@Test
	public void testHoTenDai() throws Exception {
		String HoTen = "Bùi Quang Hiếu Bùi Quang Hiếu Bùi Quang Hiếu Bùi Quang Hiếu";
		try {
			nguoiHoc.setHoTen(HoTen);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("hoTen 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test HoTen
	@Test
	public void testHoTenChuKyTuDacBiet() throws Exception {
		String HoTen = "Hiếu @";
		try {
			nguoiHoc.setHoTen(HoTen);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("hoTen 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test HoTen
	@Test
	public void testHoTenDung() throws Exception {
		String HoTen = "Bùi Quang Hiếu";
		nguoiHoc.setHoTen(HoTen);
		assertEquals("Bùi Quang Hiếu", nguoiHoc.getHoTen());
	}

//			---------------------------------------------------------

	// Test NamSinh

	@Test
	public void testNamSinhSai() throws Exception {
		try {
			nguoiHoc.setNgaySinh(new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-10"));
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Phải đủ 16 tuổi !", e.getMessage());
			System.out.println(e.getMessage());
		}

	}

	// Test NamSinh

	@Test
	public void testNamSinhDung() throws Exception {

		nguoiHoc.setNgaySinh(new SimpleDateFormat("yyyy-MM-dd").parse("2002-10-29"));
		assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse("2002-10-29"), nguoiHoc.getNgaySinh());

	}

//	---------------------------------------------------------

	// Test Phone
	@Test
	public void testDienThoaiNull() throws Exception {
		exception.expect(IllegalArgumentException.class);
		nguoiHoc.setDienThoai(null);

	}

	// Test Phone
	@Test
	public void testDienThoaiRong() throws Exception {

		try {
			nguoiHoc.setDienThoai("");
			fail("Không bắt được ngoại lệ !");
		} catch (IllegalArgumentException e) {
			assertEquals("Phone khong duoc de trong hoac rong", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test Phone
	@Test
	public void testDienThoaiSaiDinhDang() throws Exception {
		try {
			nguoiHoc.setDienThoai("0195962002");
			fail("Không bắt được ngoại lệ !");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}

	// Test Phone
	@Test
	public void testDienThoaiDung() throws Exception {

		nguoiHoc.setDienThoai("0395962002");
		assertEquals("0395962002", nguoiHoc.getDienThoai());
	}

//	---------------------------------------------------------

	// Test Email
	@Test
	public void testEmailNull() throws Exception {
		exception.expect(IllegalArgumentException.class);
		nguoiHoc.setEmail(null);

	}

	// Test Email
	@Test
	public void testEmailRong() throws Exception {

		try {
			nguoiHoc.setEmail("");
			fail("Không bắt được ngoại lệ !");
		} catch (IllegalArgumentException e) {
			assertEquals("Email khong duoc de trong hoac rong", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test Email
	@Test
	public void testEmailSaiDinhDang() throws Exception {
		try {
			nguoiHoc.setEmail("hieubqph13812");
			fail("Không bắt được ngoại lệ !");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}

	// Test Email
	@Test
	public void testEmailDung() throws Exception {

		nguoiHoc.setEmail("hieubqph13812@fpt.edu.vn");
		assertEquals("hieubqph13812@fpt.edu.vn", nguoiHoc.getEmail());
	}

//	---------------------------------------------------------

	// Test GhiChu
	@Test
	public void testGhiChuSai() throws Exception {

		try {
//						101 ký tự
			nguoiHoc.setGhiChu(
					"abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde1");
//						102 ký tự
			nguoiHoc.setGhiChu(
					"abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde12");

			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("ghiChu trong khoảng 0-100 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test GhiChu
	@Test
	public void testGhiChuDung() throws Exception {
		String GhiChu = "Chuẩn bị tạch môn =))";
		nguoiHoc.setGhiChu(GhiChu);
		assertEquals("Chuẩn bị tạch môn =))", nguoiHoc.getGhiChu());
	}

//				---------------------------------------------------------

	// Test MaNV
	@Test
	public void testMaNVNull() throws Exception {
		String MaNV = null;
		exception.expect(IllegalArgumentException.class);
		nguoiHoc.setMaNV(MaNV);
	}

	// Test MaNV
	@Test
	public void testMaNVRong() throws Exception {
		String MaNV = "";
		try {
			nguoiHoc.setMaNV(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNV khong duoc de trong hoac rong", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNV
	@Test
	public void testMaNVNgan() throws Exception {
		String MaNV = "1234";
		try {
			nguoiHoc.setMaNV(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNV có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNV
	@Test
	public void testMaNVDai() throws Exception {
		String MaNV = "1234512345123451";
		try {
			nguoiHoc.setMaNV(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNV có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNV
	@Test
	public void testMaNVSai() throws Exception {
		String MaNV = "Hieubq@";
		try {
			nguoiHoc.setMaNV(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNV có 5-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNV
	@Test
	public void testMaNVDung() throws Exception {
		String MaNV = "Hieubq";
		nguoiHoc.setMaNV(MaNV);
		assertEquals("Hieubq", nguoiHoc.getMaNV());
	}
}