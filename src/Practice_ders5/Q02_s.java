package Practice_ders5;

import java.util.Scanner;

public class Q02_s {

    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int buyuksayi=0;
         int yenisayi=10;

        int sayac=0;

        while (sayac<5) {
             yenisayi=scan.nextInt();
            if (buyuksayi<yenisayi){
                buyuksayi=yenisayi;
            }
            sayac++;
        }
        System.out.println(buyuksayi);

        for (int i = 0; i < 5; i++) {

             yenisayi=scan.nextInt();
            if (buyuksayi<yenisayi){
                buyuksayi=yenisayi;
            }
        }
        System.out.println(buyuksayi);
    }
}
