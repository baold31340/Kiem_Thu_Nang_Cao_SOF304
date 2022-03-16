

import java.util.Iterator;

public class giaiThua {
	public long giaiThua(int input) {
		if (input == 0 || input == 1) {
			return 1;
		}
		if (input <0 || input >=21) {
			throw new IllegalArgumentException();
		}
		long plus = 1;
		for (int i = 1; i <= input; i++) {
			plus *= i;
		}
		return plus;
	}
}
