package Practice_ders5;

public class Q04_s {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {

        double ilkyukseklik = 10;
        double ziplama = 0;
        double topyol=0;
        do {

            topyol=topyol+ilkyukseklik;
            ziplama++;
            ilkyukseklik = ilkyukseklik * 0.75;
            topyol+=ilkyukseklik;

        } while (ilkyukseklik > 1);

        System.out.println(ziplama);
        System.out.println(topyol);
    }

}

