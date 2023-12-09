package odev;

import java.util.Random;

public class ImeiService {

	public String ImeiNoUret() {
		Random r = new Random();
		int a1 = r.nextInt(10);
		int a2 = r.nextInt(10);
		int a3 = r.nextInt(10);
		int a4 = r.nextInt(10);
		int a5 = r.nextInt(10);
		int a6 = r.nextInt(10);
		int a7 = r.nextInt(10);
		int a8 = r.nextInt(10);
		int a9 = r.nextInt(10);
		int a10 = r.nextInt(10);
		int a11 = r.nextInt(10);
		int a12 = r.nextInt(10);
		int a13 = r.nextInt(10);
		int a14 = r.nextInt(10);
		int a15 = 0;

		int b1 = a1 + a3 + a5 + a7 + a9 + a11 + a13;
		int c1 = a2 * 2;
		if (c1 < 9) {
			c1 = c1 / 10 + c1 % 10;

		}
		int c2 = a4 * 2;
		if (c2 > 9) {
			c2 = c2 / 10 + c2 % 10;
		}
		int c3 = a6 * 2;
		if (c3 > 9) {
			c3 = c3 / 10 + c3 % 10;
		}
		int c4 = a8 * 2;
		if (c4 > 9) {
			c4 = c4 / 10 + c4 % 10;
		}
		int c5 = a10 * 2;
		if (c5 > 9) {
			c5 = c5 / 10 + c5 % 10;
		}
		int c6 = a12 * 2;
		if (c6 > 9) {
			c6 = c6 / 10 + c6 % 10;
		}
		int c7 = a14 * 2;
		if (c7 > 9) {
			c7 = c7 / 10 + c7 % 10;
		}
		int d1 = b1 + c1 + c2 + c3 + c4 + c5 + c6 + c7;
		int e1 = d1 % 10;
		if (e1 == 0) {
			a15 = 0;
		} else {
			a15 = 10 - e1;
		}
		String imei = String.valueOf(a1) + String.valueOf(a2) + String.valueOf(a3) + String.valueOf(a4)
				+ String.valueOf(a5) + String.valueOf(a6) + String.valueOf(a7) + String.valueOf(a8) + String.valueOf(a9)
				+ String.valueOf(a10) + String.valueOf(a11) + String.valueOf(a12) + String.valueOf(a13)
				+ String.valueOf(a14) + String.valueOf(a15);
		return imei;
	}

}

      
		
	
