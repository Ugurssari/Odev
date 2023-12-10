package odev;

import java.util.Random;

public class TelefonNoService {

	public String TelefonNoUret() {
		Random r = new Random();
		int a1 = 0;
		int a2 = 5;
		int a3 = 0;
		int a4 = 0;
		int a5 = r.nextInt(10);
		int a6 = r.nextInt(10);
		int a7 = r.nextInt(10);
		int a8 = r.nextInt(10);
		int a9 = r.nextInt(10);
		int a10 = r.nextInt(10);
		int a11 = r.nextInt(10);

		// 0544 123 4334
		// 0551
		a3 = r.nextInt(3, 6);
		if (a3 == 3) {
			a4 = r.nextInt(10);
		} else if (a3 == 4) {
			a4 = r.nextInt(1, 7);
		} else if (a3 == 5) {
			a4 = r.nextInt(1, 5);
		}

		String no = String.valueOf(a1) + String.valueOf(a2) + String.valueOf(a3) + String.valueOf(a4)
				+ String.valueOf(a5) + String.valueOf(a6) + String.valueOf(a7) + String.valueOf(a8) + String.valueOf(a9)
				+ String.valueOf(a10) + String.valueOf(a11);
		return no;

	}
}
