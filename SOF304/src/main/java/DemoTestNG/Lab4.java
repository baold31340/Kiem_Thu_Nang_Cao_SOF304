package DemoTestNG;

public class Lab4 {

	public double getVatOnAmount(double amount) {

		if (amount > 80) {
			return amount * 0.35;
		} else if (amount > 52 && amount <= 80) {
			return amount * 0.3;
		} else if (amount > 32 && amount <= 52) {
			return amount * 0.25;
		} else if (amount > 18 && amount <= 32) {
			return amount * 0.2;
		} else if (amount > 10 && amount <= 18) {
			return amount * 0.15;
		} else if (amount > 5 && amount <= 10) {
			return amount * 0.1;
		} else if (amount > 0 && amount <= 5) {
			return amount * 0.05;
		}
		return 0;
	}
}
