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
		return c;
	}

	public boolean checkMax(int a, int b) {
		if (a <= Integer.MAX_VALUE / 2 && b <= Integer.MAX_VALUE / 2) {
			return true;
		}
		return false;
	}

	public boolean checkMin(int a, int b) {
		if (a <= Integer.MIN_VALUE / 2 && b <= Integer.MIN_VALUE / 2) {
			return true;
		}
		return false;
	}
	
	public void checkLonHonMaxA(int a) {
		if (a >(Integer.MAX_VALUE/2)) {
			throw new IllegalArgumentException();
		}
	}
	
	public void checkLonHonMaxB(int b) {
		if (b >Integer.MAX_VALUE/2) {
			throw new IllegalArgumentException();
		}
	}
	
	public void checkLonHonMinA(int a) {
		if (a >Integer.MIN_VALUE/2) {
			throw new IllegalArgumentException();
		}
	}
	
	public void checkLonHonMinB(int b) {
		if (b >Integer.MIN_VALUE/2) {
			throw new IllegalArgumentException();
		}
	}
	
	

//Max = 2147483647 1073741823

//Min = -2147483648 -1073741824

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE / 2);
	}
}
