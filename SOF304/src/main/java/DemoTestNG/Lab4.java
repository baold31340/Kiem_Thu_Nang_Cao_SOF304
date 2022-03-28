package DemoTestNG;

public class Lab4 {

	public double getVatOnAmount(double amount) {

		if (amount > 80000000) {
			return amount * 0.35;
		} else if (amount > 52000000 && amount <= 80000000) {
			return amount * 0.3;
		} else if (amount > 32000000 && amount <= 52000000) {
			return amount * 0.25;
		} else if (amount > 18000000 && amount <= 32000000) {
			return amount * 0.2;
		} else if (amount > 10000000 && amount <= 18000000) {
			return amount * 0.15;
		} else if (amount > 5000000 && amount <= 10000000) {
			return amount * 0.1;
		}
		return amount * 0.05;

	}
}
