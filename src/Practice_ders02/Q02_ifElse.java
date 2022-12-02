package Practice_ders02;

import java.util.Scanner;

public class Q02_ifElse {
    public static void main(String[] args) {

        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan = new Scanner(System.in);
        System.out.println("sırayla vize final ve devam not giriniz");
        double vze = scan.nextDouble();
        double fnl = scan.nextDouble();
        double devm = scan.nextDouble();
        double orta = vze * 0.1 + fnl * 0.8 + devm * 0.1;

        if (orta > 100 || orta < 0) {
            System.out.println("0 ile 100 arası deger girmedin");
        } else {

            if (100 >= orta && orta >= 70) {
                System.out.println("Gectiniz");
            } else if (orta > 60) {
                System.out.println("sartlı gectiniz");
            } else {
                System.out.println("Kaldınız :(");
            }

        }
        //veya

        double vize, finalNotu, devam;

        System.out.print("Vize notunuzu giriniz : ");
        vize = scan.nextDouble();
        System.out.print("Final notunuzu giriniz : ");
        finalNotu = scan.nextDouble();
        System.out.print("Devam notunuzu giriniz : ");
        devam = scan.nextDouble();


        double ort = (vize * 0.1) + (finalNotu * 0.8) + (devam * 0.1);

        if (ort > 100 || ort < 0) {
            System.out.println("Yanlis giris yaptiniz, lutfen gecerli degerler giriniz!!!!!");
        } else if (ort >= 70) {
            System.out.println("Ortalamaniz = " + ort + " Tebrikler, caliskan Nesrin");
        } else if (ort >= 60) {
            System.out.println("Ortalamaniz = " + ort + " Sartli gectiniz, Agno'nuz 1.8'in uzerinde ise gecmis olursunuz");
        } else System.out.println("Ortalamaniz = " + ort + " Bu sefer olmadi seneye Mujgan :'(");
    }

}

