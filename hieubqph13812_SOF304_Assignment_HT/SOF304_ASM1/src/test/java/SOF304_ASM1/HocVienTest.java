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
public class HocVienTest {

	HocVien hocVien;

	@Before
	public void setUp() throws Exception {
		hocVien = new HocVien();
	}

	@After
	public void tearDown() throws Exception {
		hocVien = null;
	}

	private HocVien createTestSubject() {
		return new HocVien();
	}

	// Test MaHV
	@Test
	public void testMaHVSai() throws Exception {
		try {
			hocVien.setMaHV(0);
			hocVien.setMaHV(Integer.MAX_VALUE);
			hocVien.setMaHV(Integer.MAX_VALUE + 1);
		} catch (IllegalArgumentException e) {
			assertEquals("maHV không khả dụng", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaHV
	@Test
	public void testMaHVDung() throws Exception {
		hocVien.setMaHV(1);
		assertEquals(1, hocVien.getMaHV());
	}

	// Test MaHV
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testMaHVDung2() throws Exception {
		collector.addError(new Throwable("Lỗi ở dòng 1"));
		collector.addError(new Throwable("Lỗi ở dòng 2"));
		hocVien.setMaHV(1);

		try {
			Assert.assertTrue(1 == hocVien.getMaHV());
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

//		-------------------------------------------------

	// Test MaKH
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testMaKHSai() throws Exception {
		exception.expect(IllegalArgumentException.class);
		hocVien.setMaKH(0);
		hocVien.setMaKH(Integer.MAX_VALUE);
		hocVien.setMaKH(Integer.MAX_VALUE + 1);

	}

	// Test MaKH
	@Test
	public void testMaKHDung() throws Exception {
		hocVien.setMaKH(1);
		assertEquals(1, hocVien.getMaKH());
	}

//	-------------------------------------------------

	// Test MaNH
	@Test
	public void testMaNHNull() throws Exception {
		String MaNH = null;
		exception.expect(IllegalArgumentException.class);
		hocVien.setMaNH(MaNH);
	}

	// Test MaNH
	@Test
	public void testMaNHRong() throws Exception {
		String MaNH = "";
		try {
			hocVien.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHNgan() throws Exception {
		String MaNH = "hieu";
		try {
			hocVien.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH từ 5-15 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHDai() throws Exception {
		String MaNH = "hieubqph13812hieubqph13812hieubqph13812";
		try {
			hocVien.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH từ 5-15 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHSai() throws Exception {
		String MaNH = "hieubqph13812@";
		try {
			hocVien.setMaNH(MaNH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("maNH từ 5-15 ký tự !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test MaNH
	@Test
	public void testMaNHDung() throws Exception {
		String MaNH = "hieubq";
		hocVien.setMaNH(MaNH);
		assertEquals("hieubq", hocVien.getMaNH());
	}

//		---------------------------------------------------------

	// Test Diem
	@Test
	public void testDiemSai() throws Exception {
		try {
			hocVien.setDiem(-1);
			hocVien.setDiem(11);
			hocVien.setDiem(12);
		} catch (IllegalArgumentException e) {
			assertEquals("Điểm không khả dụng", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test Diem
	@Test
	public void testDiemDung() throws Exception {
		hocVien.setDiem(10);
		assertEquals(10, hocVien.getDiem());
	}

//			-------------------------------------------------

}