package odev;

import java.util.Random;

public class TcknService {

	public String TcknNoUret() {
		Random r = new Random();
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		int a10 = 0;
		int a11 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int c1 = 0;

		do {
			// 0-8 arası sayı ürettik
			a1 = r.nextInt(9);
			// 1-9 arası sayı bulduk, ilk karakter 0 olamaz.
			a1 = a1 + 1;
			// 0-9 arası sayılar bulduk
			a2 = r.nextInt(10);
			a3 = r.nextInt(10);
			a4 = r.nextInt(10);
			a5 = r.nextInt(10);
			a6 = r.nextInt(10);
			a7 = r.nextInt(10);
			a8 = r.nextInt(10);
			a9 = r.nextInt(10);

			b1 = a1 + a3 + a5 + a7 + a9;
			b1 = b1 * 7;
			b2 = a2 + a4 + a6 + a8;
			b3 = b1 - b2;
			a10 = b3 % 10;
			c1 = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
			a11 = c1 % 10;
		} while (a11 % 2 > 0);

		String tckn = String.valueOf(a1) + String.valueOf(a2) + String.valueOf(a3) + String.valueOf(a4)
				+ String.valueOf(a5) + String.valueOf(a6) + String.valueOf(a7) + String.valueOf(a8) + String.valueOf(a9)
				+ String.valueOf(a10) + String.valueOf(a11);
		return tckn;

	}

}
