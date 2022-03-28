package DemoTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Lab4Test {
	Lab4 lab4 = new Lab4();
  @Test
  public void getVatOnAmountTest() {
	  double exp = 510000;

		assertEquals(lab4.getVatOnAmount(5100000), exp);
		assertNotEquals(lab4.getVatOnAmount(120), exp);
  }
}
