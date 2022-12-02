package Practice_ders04;

import java.util.Scanner;

public class Q05_s {

    public static void main(String[] args) {

        int[] kenarlar = new int[3];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {
            System.out.println(i+1 + ". kenar uzunlugunu giriniz : ");
            kenarlar[i] = scan.nextInt();
        }

        if (    Math.pow(kenarlar[0],2) + Math.pow(kenarlar[1],2) == Math.pow(kenarlar[2],2) ||
                Math.pow(kenarlar[1],2) + Math.pow(kenarlar[2],2) == Math.pow(kenarlar[0],2) ||
                Math.pow(kenarlar[2],2) + Math.pow(kenarlar[0],2) == Math.pow(kenarlar[1],2)
        )
            System.out.println("Bu bir dik ucgendir");
        else System.out.println("Bu bir dik ucgen degildir");
    }

    public static int findLongestEdge(int[] kenarlar) {
        int max = kenarlar[0];

        if (kenarlar[1] > max) max = kenarlar[1];

        if (kenarlar[2] > max) max = kenarlar[2];
        return max;
    }
}
