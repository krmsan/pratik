package Practice_ders04;

import java.util.Arrays;

public class Q03_soru {
    /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(kelimehafleriarr()));//[J, o, h, n]

        String name = "Semra";

        kelimeninHarfleriArrayi("String");//[S, t, r, i, n, g]
        kelimeninHarfleriArrayi(name);//[S, e, m, r, a]

    }

    public static char[] kelimehafleriarr() {

        String input = "John";
        char[] chArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chArr[i] = input.charAt(i);
        }
        return chArr;
    }
    public static void kelimeninHarfleriArrayi(String input){

        char[] output = new char[input.length()];

        for (int konum = 0; konum < input.length(); konum++) {
            output [konum] = input.charAt(konum);
        }
        System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));
    }
}
