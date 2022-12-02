package Practice_ders04;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_soru {
    /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
    public static void main(String[] args) {



        int[] kenarlar = new int[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("kenar " + (i + 1) + " uzunlugu giriniz");
            kenarlar[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(kenarlar));//[3, 4, 5]
        Arrays.sort(kenarlar);
        System.out.println(Arrays.toString(kenarlar));


        //kenarlar[0]*kenarlar[0]+kenarlar[1]*kenarlar[1]==kenarlar[2]*kenarlar[2]

        if (Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2], 2)) {
            System.out.println("dik ucgendir");
        }
    }
}
