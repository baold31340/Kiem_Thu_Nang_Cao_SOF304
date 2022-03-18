
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class TinhGiaiThuaTest {

	TinhGiaiThua giaiThua;

	@Before
	public void setUp() throws Exception {
		giaiThua = new TinhGiaiThua();
	}

	@After
	public void tearDown() throws Exception {
		giaiThua = null;
	}

//	private TinhGiaiThua createTestSubject() {
//		return new TinhGiaiThua();
//	}

	// Chú thích test
	@Test(expected = IllegalArgumentException.class)
	public void testGiaiThuaLaSoAm() throws Exception {
		giaiThua.GiaiThua(-1);
		giaiThua.GiaiThua(22);
		giaiThua.GiaiThua(21);
	}

	// try-catch
	@Test
	public void testGiaiThuaSaiTryCatch1() throws Exception {
		try {
			giaiThua.GiaiThua(-1);
			giaiThua.GiaiThua(22);
			giaiThua.GiaiThua(21);

			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
		}
	}

	// Ghi chú lỗi với try-catch
	@Test
	public void testGiaiThuaSaiTryCatch2() throws Exception {
		try {
			giaiThua.GiaiThua(-1);
			giaiThua.GiaiThua(22);
			giaiThua.GiaiThua(21);

			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Số nhập vào không được âm và trong khoảng từ 0..20", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

	// Rule
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testGiaiThuaSaiRule() throws Exception {
		exception.expect(IllegalArgumentException.class);
		giaiThua.GiaiThua(-1);
		giaiThua.GiaiThua(22);
		giaiThua.GiaiThua(21);
	}

	
	
	// try-catch Sum
	@Test
	public void testTongTryCatch1() throws Exception {
		try {
			giaiThua.tong(Integer.MIN_VALUE, -1);

			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {

		}
	}

}