package Practice_ders02;

import java.util.Scanner;

public class Q01_Scanner {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions
         * Question
         * 1 = how many tea do you drink in a day?
         * Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
        Scanner scan= new Scanner(System.in);
        System.out.println("gunde kac bardak ve kac seker");

        int kacBardak = scan.nextInt();
        int kacseker = scan.nextInt();
        double yillikSeker = 0;
        double kgOlarakseker = 0;
        yillikSeker = kacBardak * kacseker * 365;
        kgOlarakseker = 2.77 * yillikSeker / 1000;

        if (kacseker > 0 && kacBardak>0) {
            System.out.println("yıllık : " + kgOlarakseker + " kg seker kullanır" + "40 yılda : " + kgOlarakseker * 40 + " seker kullanır");
        } else {
            System.out.println("Aferin, boyle devam et :");
        }
//veya


        System.out.print("Gunde kac bardak cay iciyorsunuz? : ");
        double bardak = scan.nextDouble();

        System.out.print("Her bardak icin kac kup seker kullaniyorsunuz? : ");
        double seker = scan.nextDouble();

        double yillikTuketimKG =(bardak * seker * 2.77) * 365 / 1000;
        double kirkYillikTuketimKG = yillikTuketimKG * 40;

        if (seker==0){
            System.out.println("Hey Human, go on :)");
        }else{
            System.out.println("Yillik seker tuketiminiz " + yillikTuketimKG + " kg'dir.\n" +
                    "40 yillik seker tuketiminiz " + kirkYillikTuketimKG + " kg'dir." );
        }


    }
}
