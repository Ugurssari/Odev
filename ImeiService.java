package odev;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		var tckn = new TcknService();
		var imei = new ImeiService();
		
		var tlfno = new TelefonNoService();
		System.out.println(tlfno.TelefonNoUret());
		
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/
        System.out.println("-------------------------\n");
        System.out.println("1 - Rasgele Kişi Üret");
        System.out.println("2 - Çıkış");
        System.out.print("Seçiniz: ");
        selection = input.nextInt();		
        switch (selection) {
            case 1:
                // Perform "original number" case.
            	System.out.println("1");
            	
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            default:
                // The user input an unexpected choice.
        }
        
		
		/*
        Scanner in = new Scanner(System.in);
        System.out.print("Deger giriniz: ");
        int deger = in.nextInt();

        System.out.println("------------------------");
        for (int i = 0; i < deger; i++) {
        	System.out.print("Tc No:" + tckn.TcknYazdir());
        	System.out.println(" Imei No:" + imei.ImeiYazdir());
        	System.out.println("------------------------");
        }
*/
	
	}
	

}
