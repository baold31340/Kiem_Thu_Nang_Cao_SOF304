package SOF304.Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class giaiThuaTest {
    giaiThua giaiThua;

	private giaiThua createTestSubject() {
		return new giaiThua();
	}
	
    @Before
    public void init() {
    	giaiThua = new giaiThua();
    	System.out.println("Start");
    }
    
    @After
    public void tearDown() {
    	giaiThua = null;
    	System.out.println("Stop");
    }

	@Test
	public void testGiaiThua() throws Exception {
		assertEquals(120, giaiThua.giaiThua(5));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGiaiThuaSoAm() throws Exception {
		giaiThua.giaiThua(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGiaiThuaLonHon21() throws Exception {
		giaiThua.giaiThua(22);
	}
	
	@Test
	public void testGiaiThuaNhoHon21() throws Exception {
		assertEquals(2432902008176640000L, giaiThua.giaiThua(20));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGiaiThuaBangSo21() throws Exception {
		giaiThua.giaiThua(21);
	}
	
	@Test
	public void testGiaiThuaBang0() throws Exception {
		assertEquals(1, giaiThua.giaiThua(0));
	}
	
	@Test
	public void testGiaiThuaBang1() throws Exception {
		assertEquals(1, giaiThua.giaiThua(1));
	}
}