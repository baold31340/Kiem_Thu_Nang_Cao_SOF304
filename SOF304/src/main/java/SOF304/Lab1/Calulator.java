package SOF304.Lab1;

public class Calulator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		if (b ==0) {
			throw new ArithmeticException("Số chia phải khác 0");
		}
		return c;
	}

	public boolean checkMax(int a, int b) {


		int c = a + b;

		if (b == Integer.MAX_VALUE && a > 0) {
			return false;
		}
		if (a == Integer.MAX_VALUE && b > 0) {
			return false;
		}

		if (c > Integer.MAX_VALUE) {
			return false;
		}
		return true;

	}

	public boolean checkMin(int a, int b) {
//		if (a <= Integer.MIN_VALUE / 2 && b <= Integer.MIN_VALUE / 2) {
//			return true;
//		}
//		return false;

		int c = a + b;
		if (c >= Integer.MIN_VALUE) {
			return true;
		} else {
			return false;
		}
	}

	public void checkLonHonMaxA(int a, int b) {

		int c = a + b;
		if (c >= Integer.MAX_VALUE && a >= Integer.MAX_VALUE) {
			throw new IllegalArgumentException();
		}
	}

	public void checkLonHonMaxB(int a, int b) {
		int c = a + b;
		if (c >= Integer.MAX_VALUE && b >= Integer.MAX_VALUE) {
			throw new IllegalArgumentException();
		}
	}

	public void checkLonHonMinA(int a, int b) {
		int c = a + b;
		if (c < Integer.MIN_VALUE && a < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
	}

	public void checkLonHonMinB(int a, int b) {
		int c = a + b;
		if (c < Integer.MIN_VALUE && b < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
	}

//Max = 2147483647 1073741823

//Min = -2147483648 -1073741824

}
