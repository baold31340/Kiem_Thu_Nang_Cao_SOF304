package DemoTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class chuViTest {
	
	chuVi chuVi = new chuVi();

  @Test
  public void tinhChuViTest() {
//    throw new RuntimeException("Test not implemented");
	  assertEquals(chuVi.tinhChuVi(2, 3), 10);
  }
  
  @Test
  public void tinhChuViTest2() {
//    throw new RuntimeException("Test not implemented");
	  assertEquals(chuVi.tinhChuVi(4, 5), 18);
  }
  
  @Test
  public void tinhChuViTest3() {
//    throw new RuntimeException("Test not implemented");
	  assertEquals(chuVi.tinhChuVi(2, 3), 5);
  }
}
