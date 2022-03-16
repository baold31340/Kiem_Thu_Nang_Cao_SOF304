import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParmaterGiaiThuaTest {

	int so;
	long ketQua;

	TinhGiaiThua giaiThua;

	@Before
	public void setUp() {
		giaiThua = new TinhGiaiThua();
	}

	@After
	public void tearnDown() {
		giaiThua = null;
	}

	public ParmaterGiaiThuaTest(int so, long ketQua) {
		super();
		this.so = so;
		this.ketQua = ketQua;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { 1, 1 },
			{ 2, 2 },
			{ 3, 6 },
			{ 4, 24 },
			{ 5, 120 },
			{ 6, 720 },
			{ 7, 5040 }});
	}

	@Test
	public void kiemtragiaithuavoinhieuthamso() {
		System.out.println("Tham số: thực ");
		long ketqua = giaiThua.GiaiThua(so);
		System.out.println(ketqua);
		assertEquals(ketQua, ketqua);
	}
}
