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
public class KhoaHocTestNgoaiLe {
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
		khoaHoc.setMaKH(-20);
		khoaHoc.setMaKH(Integer.MAX_VALUE + 3);
	}

	// Test TenKH
	@Test
	public void testTenKHNull() throws Exception {
		String TenKH = null;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setTenKH(TenKH);
	}

	// Test TenKH
	@Test
	public void testTenKHRong() throws Exception {
		String TenKH = "";
		try {
			khoaHoc.setTenKH(TenKH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenKH không được null hoặc rỗng !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Test TenKH
	@Test
	public void testTenKHNgan() throws Exception {
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
	public void testHoTenChuKyTuDacBiet() throws Exception {
		String tenKH = "Kiểm thử nâng cao @";
		try {
			khoaHoc.setTenKH(tenKH);
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
		khoaHoc.setThoiLuong(125);
		khoaHoc.setThoiLuong(-20);
	}

	// Test HocPhi
	@Test
	public void testHocPhiSai() throws Exception {

		exception.expect(IllegalArgumentException.class);
		khoaHoc.setHocPhi(-10000);
		khoaHoc.setHocPhi(55000000);

	}
	
	
	// Test SoLuongHV
		@Test
		public void testSoLuongHVSai() throws Exception {

			exception.expect(IllegalArgumentException.class);
			khoaHoc.setSoLuongHV(-50);
			khoaHoc.setSoLuongHV(30);

		}

}