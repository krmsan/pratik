package Practice_ders01;


public class Q02_Rakamlariyazdir {
    /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin.

    input : 76453
    output: 7
            6
            4
            5
            3

     */
    public static void main(String[] args) {

        int sayi = 76453;
        System.out.println(sayi);
        int birler = sayi % 10;
        System.out.print(birler);
        int onlar = (sayi / 10) % 10;
        System.out.print(onlar);
        int yuzler = (sayi / 100) % 10;
        System.out.print(yuzler);
        int binler = (sayi / 1000) % 10;
        System.out.print(binler);
        int onbinler = (sayi / 10000) % 10;
        System.out.println(onbinler);

        System.out.println("***********************************");

        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);

        //veya toplamları için
        int top = sayi % 10;//3
        sayi = sayi / 10;//7645
        top = sayi % 10 + top;//5
        sayi = sayi / 10;//764
        top = sayi % 10 + top;//4
        sayi = sayi / 10;//76
        top = sayi % 10 + top;//6
        sayi = sayi / 10;//7
        top = sayi % 10 + top;//7
        sayi = sayi / 10;//0

        System.out.println("top sayi: " + top + "sayi:" + sayi);

        //veya böyle
        sayi = 76453;
        birler = sayi % 10;
        onlar = (sayi / 10) % 10;
        yuzler = (sayi / 100) % 10;
        binler = (sayi / 1000) % 10;
        onbinler = (sayi / 10000) % 10;

        sayi=12345;
        sayi=sayi/100;
        System.out.println(sayi);//123


    }
}
