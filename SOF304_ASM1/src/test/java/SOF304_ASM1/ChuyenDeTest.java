package SOF304_ASM1;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class ChuyenDeTest {
	ChuyenDe chuyenDe;

	@Before
	public void setUp() throws Exception {
		chuyenDe = new ChuyenDe();
	}

	@After
	public void tearDown() throws Exception {
		chuyenDe = null;
	}

	private ChuyenDe createTestSubject() {
		return new ChuyenDe();
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

	// Test MaCD
	@Test
	public void testMaCDNull() throws Exception {
		String maCD = null;
		exception.expect(IllegalArgumentException.class);
		chuyenDe.setMaCD(maCD);
	}

	// Test MaCD
	@Test
	public void testMaCDRong() throws Exception {
		String maCD = "";
		try {
			chuyenDe.setMaCD(maCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("MaCD khong duoc null hoac rong !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaCD
	@Test
	public void testMaCDNgan() throws Exception {
		String MaCD = "KT";
		try {
			chuyenDe.setMaCD(MaCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maCD có 3-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaCD
	@Test
	public void testMaCDDai() throws Exception {
		String MaCD = "KTNCKTNCKTNCKTNC";
		try {
			chuyenDe.setMaCD(MaCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maCD có 3-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaCD
	@Test
	public void testMaCDSai() throws Exception {
		String MaNV = "KTNC@";
		try {
			chuyenDe.setMaCD(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maCD có 3-15 ký tự tự, chữ hoặc số", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaCD
	@Test
	public void testMaCDDung() throws Exception {
		String maCD = "KTNC";
		chuyenDe.setMaCD(maCD);
		assertEquals("KTNC", chuyenDe.getMaCD());
	}

	// Test MaCD
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testMaCDDung2() throws Exception {
		collector.addError(new Throwable("Lỗi ở dòng 1"));
		collector.addError(new Throwable("Lỗi ở dòng 2"));

		chuyenDe.setMaCD("KTNC");

		try {
			Assert.assertTrue("KTNC" == chuyenDe.getMaCD());
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

//	---------------------------------------------------------

	// Test TenCD
	@Test
	public void testTenCDNull() throws Exception {
		String TenCD = null;
		exception.expect(IllegalArgumentException.class);
		chuyenDe.setTenCD(TenCD);
	}

	// Test TenCD
	@Test
	public void testTenCDRong() throws Exception {
		String TenCD = "";
		try {
			chuyenDe.setTenCD(TenCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("TenCD khong duoc null hoac rong !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenCD
	@Test
	public void testTenCDNgan() throws Exception {
		String TenCD = "Kiểm";
		try {
			chuyenDe.setTenCD(TenCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenCD có 5-100 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenCD
	@Test
	public void testTenCDDai() throws Exception {
		String TenCD = "Kiểm thử nâng cao SOF304 Kiểm thử nâng cao SOF304 Kiểm thử nâng cao SOF304 Kiểm thử nâng cao SOF304 Kiểm thử nâng cao SOF304";
		try {
			chuyenDe.setTenCD(TenCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenCD có 5-100 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenCD
	@Test
	public void testTenCDChuKyTuDacBiet() throws Exception {
		String TenCD = "Kiểm thử nâng cao SOF304@";
		try {
			chuyenDe.setTenCD(TenCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenCD có 5-100 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenCD
	@Test
	public void testTenCDDung() throws Exception {
		String TenCD = "Kiểm thử nâng cao SOF304";
		chuyenDe.setTenCD(TenCD);
		assertEquals("Kiểm thử nâng cao SOF304", chuyenDe.getTenCD());
	}

//	---------------------------------------------------------

	// Test HocPhi
	@Test
	public void testHocPhiSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		chuyenDe.setHocPhi(0);
		chuyenDe.setHocPhi(-1);
		chuyenDe.setHocPhi(100000000);
		chuyenDe.setHocPhi(100000001);
	}

	// Test HocPhi
	@Test
	public void testHocPhiDung() throws Exception {
		double HocPhi = 500000;
		chuyenDe.setHocPhi(HocPhi);
		assertEquals(500000, chuyenDe.getHocPhi());
	}

//	---------------------------------------------------------

	// Test ThoiLuong
	@Test
	public void testThoiLuongSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		chuyenDe.setHocPhi(0);
		chuyenDe.setHocPhi(-1);
		chuyenDe.setHocPhi(1000);
		chuyenDe.setHocPhi(1001);
	}

	// Test ThoiLuong
	@Test
	public void testThoiLuongDung() throws Exception {

		chuyenDe.setThoiLuong(90);
		assertEquals(90, chuyenDe.getThoiLuong());
	}

//		---------------------------------------------------------

	// Test Image
	@Test
	public void testImageNull() throws Exception {
		String Image = null;
		exception.expect(IllegalArgumentException.class);
		chuyenDe.setHinh(Image);
	}

	// Test Image
	@Test
	public void testImageRong() throws Exception {
		String Image = "";
		try {
			chuyenDe.setHinh(Image);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Image khong duoc null hoac rong !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test Image
	@Test
	public void testImageSai() throws Exception {

		try {
			chuyenDe.setHinh("abcd");
			chuyenDe.setHinh("abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde1");
			chuyenDe.setHinh("abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde12");
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Image trong khoảng 5-50 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test Image
	@Test
	public void testImageDung() throws Exception {
		String Image = "abc.jpg";
		chuyenDe.setHinh(Image);
		assertEquals("abc.jpg", chuyenDe.getHinh());
	}

//		---------------------------------------------------------

	// Test MoTa
	@Test
	public void testMoTaSai() throws Exception {

		try {
//					101 ký tự
			chuyenDe.setMoTa(
					"abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde1");
//					102 ký tự
			chuyenDe.setMoTa(
					"abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde12");

			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("MoTa trong khoảng 0-100 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MoTa
	@Test
	public void testMoTaDung() throws Exception {
		String MoTa = "Chuẩn bị tạch môn =))";
		chuyenDe.setMoTa(MoTa);
		assertEquals("Chuẩn bị tạch môn =))", chuyenDe.getMoTa());
	}

//			---------------------------------------------------------

}