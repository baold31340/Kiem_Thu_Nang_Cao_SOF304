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
public class KhoaHocTest {
	KhoaHoc khoaHoc;

	@Before
	public void setUp() throws Exception {
		khoaHoc = new KhoaHoc();
	}

	@After
	public void tearDown() throws Exception {
		khoaHoc = null;
	}

	private KhoaHoc createTestSubject() {
		return new KhoaHoc();
	}

	// ----------------------------------------

	// Test maKH
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testMaKHSai() throws Exception {
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setMaKH(0);
		khoaHoc.setMaKH(Integer.MAX_VALUE);
		khoaHoc.setMaKH(Integer.MAX_VALUE + 1);
	}

	@Test
	public void testMaKHDung() throws Exception {
		khoaHoc.setMaKH(10);
		assertEquals(10, khoaHoc.getMaKH());
	}

//	----------------------------------------------
	// Test MaCD
	@Test
	public void testMaCDNull() throws Exception {
		String maCD = null;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setMaCD(maCD);
	}

	// Test MaCD
	@Test
	public void testMaCDRong() throws Exception {
		String maCD = "";
		try {
			khoaHoc.setMaCD(maCD);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("MaCD không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaCD
	@Test
	public void testMaCDDung() throws Exception {
		String maCD = "Hieubq";
		khoaHoc.setMaCD(maCD);
		assertEquals("Hieubq", khoaHoc.getMaCD());
	}

//		---------------------------------------------------------

	// Test HocPhi
	@Test
	public void testHocPhiSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setHocPhi(0);
		khoaHoc.setHocPhi(-1);
		khoaHoc.setHocPhi(100000000);
		khoaHoc.setHocPhi(100000001);
	}

	// Test HocPhi
	@Test
	public void testHocPhiDung() throws Exception {
		double HocPhi = 500000;
		khoaHoc.setHocPhi(HocPhi);
		assertEquals(500000, khoaHoc.getHocPhi());
	}

//		---------------------------------------------------------

	// Test ThoiLuong
	@Test
	public void testThoiLuongSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setHocPhi(0);
		khoaHoc.setHocPhi(-1);
		khoaHoc.setHocPhi(1000);
		khoaHoc.setHocPhi(1001);
	}

	// Test ThoiLuong
	@Test
	public void testThoiLuongDung() throws Exception {

		khoaHoc.setThoiLuong(90);
		assertEquals(90, khoaHoc.getThoiLuong());
	}

//			---------------------------------------------------------

	// Test NgayKG
	@Test
	public void testNgayKGSai() throws Exception {

		try {
			khoaHoc.setNgayTao(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-19"));
			khoaHoc.setNgayKG(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-20"));
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Ít nhất là 5 ngày", e.getMessage());
			System.out.println(e.getMessage());
		}

	}

	// Test NgayKG
	@Test
	public void testNgayKGDung() throws Exception {
		khoaHoc.setNgayTao(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-10"));
		khoaHoc.setNgayKG(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-20"));
		assertEquals(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-20"), khoaHoc.getNgayKG());

	}
	
//	----------------------------------------------
	// Test MaNV
	@Test
	public void testMaNVNull() throws Exception {
		String MaNV = null;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setMaNV(MaNV);
	}

	// Test MaNV
	@Test
	public void testMaNVRong() throws Exception {
		String MaNV = "";
		try {
			khoaHoc.setMaNV(MaNV);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNV không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	// Test MaNV
	@Test
	public void testMaNVNgan() throws Exception {
		String MaNV = "1234";
		try {
			khoaHoc.setMaNV(MaNV);
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
			khoaHoc.setMaNV(MaNV);
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
			khoaHoc.setMaNV(MaNV);
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
		khoaHoc.setMaNV(MaNV);
		assertEquals("Hieubq", khoaHoc.getMaNV());
	}

//		---------------------------------------------------------

}