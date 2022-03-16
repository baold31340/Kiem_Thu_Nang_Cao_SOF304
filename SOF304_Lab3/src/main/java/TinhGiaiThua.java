import java.util.Iterator;

public class TinhGiaiThua {

//	int soNhap;

//	public int getSoNhap() {
//		return soNhap;
//	}


	public long GiaiThua(int inputNumber) {
		if (inputNumber < 0 || inputNumber >= 21) {
			throw new IllegalArgumentException("Số nhập vào không được âm và trong khoảng từ 0..20");
		}
		if (inputNumber == 0 || inputNumber == 1) {
			return 1;
		}
		long result = 1;

		for (int i = 1; i <= inputNumber; i++) {
			result *= i;
		}
		return result;
	}

	public int tong(int a, int b) {

		if (a == Integer.MAX_VALUE && b > 0) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (b == Integer.MAX_VALUE && a > 0) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (a < Integer.MAX_VALUE && b > Integer.MAX_VALUE - a) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (b < Integer.MAX_VALUE && a > Integer.MAX_VALUE - b) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (a == Integer.MIN_VALUE && b < 0) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (b == Integer.MIN_VALUE && a < 0) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (a > Integer.MIN_VALUE && b < Integer.MIN_VALUE - a) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		if (b > Integer.MIN_VALUE && a < Integer.MIN_VALUE - b) {
			throw new IllegalArgumentException("Giá trị không nằm trong khoảng Integer");
		}

		int c = a + b;
		return c;
	}

}
