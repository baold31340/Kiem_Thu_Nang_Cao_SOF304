package SOF304_ASM1_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import SOF304_ASM1_1.KhoaHoc;

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

	// Test maKH
	@Test
	public void testMaKHDung() throws Exception {
		khoaHoc.setMaKH(10);
		assertEquals(10, khoaHoc.getMaKH());
	}

	// Test maKH
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testMaKHDung2() throws Exception {
		collector.addError(new Throwable("Lỗi ở dòng 1"));
		collector.addError(new Throwable("Lỗi ở dòng 2"));
		khoaHoc.setMaKH(10);
		try {
			Assert.assertTrue(10 == khoaHoc.getMaKH());
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

	// Test TenKH
	@Test
	public void testTenKHDung() throws Exception {
		String HoTen = "Kiểm thử nâng cao";
		khoaHoc.setTenKH(HoTen);
		assertEquals("Kiểm thử nâng cao", khoaHoc.getTenKH());
	}

	// Test ThoiLuong
	@Test
	public void testThoiLuongDung() throws Exception {

		khoaHoc.setThoiLuong(90);
		assertEquals(90, khoaHoc.getThoiLuong());
	}

	// Test HocPhi
	@Test
	public void testHocPhiDung() throws Exception {
		double HocPhi = 500000;
		khoaHoc.setHocPhi(HocPhi);
		assertEquals(500000, khoaHoc.getHocPhi());
	}

	// Test SoLuongHV
	@Test
	public void testSoLuongHVDung() throws Exception {

		khoaHoc.setSoLuongHV(15);
		assertEquals(15, khoaHoc.getSoLuongHV());
	}
}