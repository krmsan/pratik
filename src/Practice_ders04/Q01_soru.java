package Practice_ders04;

public class Q01_soru {
    /*
     * Ask the user for a String and a sentence
     * Find and print occurrence of String in sentence.
     * (without case sensitivity)
     *
     * sentence =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
     * sentence =“I am coming” String=“com” output ="there is 1 “com” in sentence "
     *
     *//*
     * Kullanicidan bir kelime ve cumle aliniz
     * Kelimeyi cumle icinde aratip yazdiriniz
     *
     * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
     * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
     *
     */
    public static void main(String[] args) {
        kelimevarMi();
    }

    public static void kelimevarMi() {
        String str = "sami tezcan";
        String aranan = "can";
        int sayac = 0;


        if (str.contains(aranan)) {
            System.out.println("evet var");
        }
        for (int i = 0; i <= str.length() - aranan.length(); i++) {
            if (str.substring(i, i + aranan.length()).equalsIgnoreCase(aranan)) {
                sayac++;

            }

        }
        int kackere=0;
        while (kackere<2){
            if (str.contains(aranan)) {
                System.out.println("evet var");
                kackere++;
            }

        }
        System.out.println(sayac);
        System.out.println(kackere);
    }
}
