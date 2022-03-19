package SOF304_ASM1;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
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
	public void testMaCDDung() throws Exception {
		String maCD = "Hieubq";
		chuyenDe.setMaCD(maCD);
		assertEquals("Hieubq", chuyenDe.getMaCD());
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
	public void testTenCDDung() throws Exception {
		String TenCD = "Kiem thu nang cao";
		chuyenDe.setTenCD(TenCD);
		assertEquals("Kiem thu nang cao", chuyenDe.getTenCD());
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
		public void testImageDung() throws Exception {
			String Image = "abc.jpg";
			chuyenDe.setHinh(Image);
			assertEquals("abc.jpg", chuyenDe.getHinh());
		}

//		---------------------------------------------------------

}