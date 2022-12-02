package Practice_ders03;

import java.util.Scanner;

public class Q01_soru {
    /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi gir");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("islemi sec: " + "\n 1. toplama \n 2. cıkarma \n 3. carpma \n 4. bölme ");
        int islem = scan.nextInt();

        if (islem == 1) System.out.println("Toplam: " + (sayi1 + sayi2));
        if (islem == 2) System.out.println("Cıkarma: " + (sayi1 - sayi2));
        if (islem == 3) System.out.println("Carpma: " + (sayi1 * sayi2));
        if (islem == 4) System.out.println("bölme: " + ((double) sayi1 / sayi2));

        int s1 = birSayiAl();
        int s2 = birSayiAl();
        int is = islemAl();
        double sn = son(islem, sayi1, sayi2);
        System.out.println(sn);
        double islemsonucu = sayiAlma();
        if(islemsonucu>20){
            System.out.println("sayi 20 den büyük");
        }
    }

    public static int birSayiAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi1 = scan.nextInt();
        return sayi1;
    }

    public static int islemAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("islemi sec: " + "\n 1. toplama \n 2. cıkarma \n 3. carpma \n 4. bölme ");
        int sayi1 = scan.nextInt();
        return sayi1;
    }

    public static double sayiAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi gir");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("islemi sec: " + "\n 1. toplama \n 2. cıkarma \n 3. carpma \n 4. bölme ");
        int islem = scan.nextInt();

        double sonuc = son(islem,sayi1,sayi2);
        return sonuc;


    }

    public static double son(double islem, int sayi1, int sayi2) {
        double sonuc = 0;

        if (islem == 1) System.out.println("Toplam: " + (sonuc = sayi1 + sayi2));
        if (islem == 2) System.out.println("Cıkarma: " + (sonuc = sayi1 - sayi2));
        if (islem == 3) System.out.println("Carpma: " + (sonuc = sayi1 * sayi2));
        if (islem == 4) System.out.println("bölme: " + (sonuc = (double) sayi1 / sayi2));

        return sonuc;

    }
}
