package SOF304.Lab2;

import SOF304.Lab2.Class.PhuongTrinhBacHai;

public class phuongTrinhBacHai {

	private double a, b, c;

	public phuongTrinhBacHai(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public PhuongTrinhBacHai Solution() {

		double d = b * b - 4 * a * c;

		// Checking if the equation has roots
		if (d < 0) {
			throw new ArithmeticException("Solution has no roots.");
		} else if (d > Double.MAX_VALUE) {
			throw new ArithmeticException("Solution has no roots.");
		} else if (d < Double.MIN_VALUE) {
			throw new ArithmeticException("Solution has no roots.");
		}

		else {
			// Calculate the result
			PhuongTrinhBacHai result = new PhuongTrinhBacHai();
			result.x1 = (-b - Math.sqrt(d)) / (2 * a);
			result.x2 = (-b + Math.sqrt(d)) / (2 * a);

			// Return the result
			return result;
		}
	}
}
