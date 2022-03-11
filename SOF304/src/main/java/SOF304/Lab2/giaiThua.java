package SOF304.Lab2;

import java.util.Iterator;

public class giaiThua {
	public long giaiThua(int input) {
		if (input == 0 || input == 1) {
			return 1;
		}
		if (input <0 || input >21) {
			System.out.println("Giá trị đầu vào không đúng");
			return -1;
		}
		long plus = 1;
		for (int i = 1; i <= input; i++) {
			plus *= i;
		}
		return plus;
	}
}
