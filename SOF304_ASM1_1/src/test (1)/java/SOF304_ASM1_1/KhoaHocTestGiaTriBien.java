package SOF304_ASM1_1;

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

import SOF304_ASM1_1.KhoaHoc;

@Generated(value = "org.junit-tools-1.1.0")
public class KhoaHocTestGiaTriBien {
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
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testMaKHSai() throws Exception {
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setMaKH(0);
		khoaHoc.setMaKH(-1);
		khoaHoc.setMaKH(Integer.MAX_VALUE);
		khoaHoc.setMaKH(Integer.MAX_VALUE + 1);
	}

	// Test TenKH
	@Test
	public void testHoTenNgan() throws Exception {
		String TenKH = "Hi";
		try {
			khoaHoc.setTenKH(TenKH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenKH 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenKH
	@Test
	public void testHoTenDai() throws Exception {
		String TenKH = "Kiểm thử nâng caoKiểm thử nâng caoKiểm thử nâng cao";
		try {
			khoaHoc.setTenKH(TenKH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenKH 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test ThoiLuong
	@Test
	public void testThoiLuongSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setThoiLuong(0);
		khoaHoc.setThoiLuong(1);
		khoaHoc.setThoiLuong(-1);
		khoaHoc.setThoiLuong(120);
		khoaHoc.setThoiLuong(121);
	}

	// Test HocPhi
	@Test
	public void testHocPhiSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setHocPhi(0);
		khoaHoc.setHocPhi(-1);
		khoaHoc.setHocPhi(50000001);
	}

	// Test SoLuongHV
	@Test
	public void testSoLuongHVSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setSoLuongHV(0);
		khoaHoc.setSoLuongHV(-1);
		khoaHoc.setSoLuongHV(26);
	}
}