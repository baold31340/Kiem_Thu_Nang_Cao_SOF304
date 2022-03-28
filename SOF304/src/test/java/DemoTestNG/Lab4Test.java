package DemoTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Lab4Test {
	Lab4 lab4 = new Lab4();
  @Test(groups = "test80")
  public void getVatOnAmountTestLonHon80() {
	  double exp = 28.35;

		assertEquals((double)Math.round(lab4.getVatOnAmount(81) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(82), exp);
  }
  
  @Test(groups = "test80")
  public void getVatOnAmountTestBang80() {
	  double exp = 24;

		assertEquals(lab4.getVatOnAmount(80), exp);
		assertNotEquals(lab4.getVatOnAmount(81), exp);
  }
  
  @Test(groups = "test80")
  public void getVatOnAmountTestNhoHon80() {
	  double exp = 23.7;

		assertEquals((double)Math.round(lab4.getVatOnAmount(79)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(80), exp);
  }
  
  @Test(groups = "test52")
  public void getVatOnAmountTestLonHon52() {
	  double exp = 15.9;

		assertEquals((double)Math.round(lab4.getVatOnAmount(53) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(54), exp);
  }
  
  @Test(groups = "test52")
  public void getVatOnAmountTestBang52() {
	  double exp = 13;

		assertEquals(lab4.getVatOnAmount(52), exp);
		assertNotEquals(lab4.getVatOnAmount(53), exp);
  }
  
  @Test(groups = "test52")
  public void getVatOnAmountTestNhoHon52() {
	  double exp = 12.75;

		assertEquals((double)Math.round(lab4.getVatOnAmount(51)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(52), exp);
  }
  
  @Test(groups = "test32")
  public void getVatOnAmountTestLonHon32() {
	  double exp = 8.25;

		assertEquals((double)Math.round(lab4.getVatOnAmount(33) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(34), exp);
  }
  
  @Test(groups = "test32")
  public void getVatOnAmountTestBang32() {
	  double exp = 6.4;

		assertEquals(lab4.getVatOnAmount(32), exp);
		assertNotEquals(lab4.getVatOnAmount(33), exp);
  }
  
  @Test(groups = "test32")
  public void getVatOnAmountTestNhoHon32() {
	  double exp = 6.2;

		assertEquals((double)Math.round(lab4.getVatOnAmount(31)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(32), exp);
  }
  
  @Test(groups = "test18")
  public void getVatOnAmountTestLonHon18() {
	  double exp = 3.8;

		assertEquals((double)Math.round(lab4.getVatOnAmount(19) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(20), exp);
  }
  
  @Test(groups = "test18")
  public void getVatOnAmountTestBang18() {
	  double exp = 2.7;

		assertEquals((double)Math.round(lab4.getVatOnAmount(18)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(19), exp);
  }
  
  @Test(groups = "test18")
  public void getVatOnAmountTestNhoHon18() {
	  double exp = 2.55;

		assertEquals((double)Math.round(lab4.getVatOnAmount(17)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(18), exp);
  }
  
  @Test(groups = "test10")
  public void getVatOnAmountTestLonHon10() {
	  double exp = 1.65;

		assertEquals((double)Math.round(lab4.getVatOnAmount(11) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(12), exp);
  }
  
  @Test(groups = "test10")
  public void getVatOnAmountTestBang10() {
	  double exp = 1.0;

		assertEquals((double)Math.round(lab4.getVatOnAmount(10)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(11), exp);
  }
  
  @Test(groups = "test10")
  public void getVatOnAmountTestNhoHon10() {
	  double exp = 0.9;

		assertEquals((double)Math.round(lab4.getVatOnAmount(9)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(10), exp);
  }
  
  @Test(groups = "test5")
  public void getVatOnAmountTestLonHon5() {
	  double exp = 0.6;

		assertEquals((double)Math.round(lab4.getVatOnAmount(6) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(7), exp);
  }
  
  @Test(groups = "test5")
  public void getVatOnAmountTestBang5() {
	  double exp = 0.25;

		assertEquals((double)Math.round(lab4.getVatOnAmount(5)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(6), exp);
  }
  
  @Test(groups = "test5")
  public void getVatOnAmountTestNhoHon5() {
	  double exp = 0.2;

		assertEquals((double)Math.round(lab4.getVatOnAmount(4)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(5), exp);
  }
  
  @Test(groups = "test0")
  public void getVatOnAmountTestLonHon0() {
	  double exp = 0.05;

		assertEquals((double)Math.round(lab4.getVatOnAmount(1) * 100) / 100, exp);
		assertNotEquals(lab4.getVatOnAmount(2), exp);
  }
  
  @Test(groups = "test0")
  public void getVatOnAmountTestBang0() {
	  double exp = 0;

		assertEquals((double)Math.round(lab4.getVatOnAmount(0)*100)/100, exp);
		assertNotEquals(lab4.getVatOnAmount(1), exp);
  }
  
  @Test(groups = "test0")
  public void getVatOnAmountTestNhoHon0() {
	  double exp = 0;

		assertEquals(lab4.getVatOnAmount(-1), exp);
		assertNotEquals(lab4.getVatOnAmount(2), exp);
  }
}
