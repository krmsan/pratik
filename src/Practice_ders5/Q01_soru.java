package Practice_ders5;

public class Q01_soru {

    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
    public static void main(String[] args) {

        bol(10,2);

    }
    public static void bol(int bolunen,int bolen){
        int bolum=0;
        while (bolunen>=bolen){
            bolunen=bolunen-bolen;
            bolum++;

            int kalan=bolunen;

        }
        System.out.println(bolum);
    }
}
