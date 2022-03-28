package KDVTutarıOdevi;

import java.util.Scanner;

public class KDVTutariOdevi {

    public static void main(String[] args) {
        //Scanner'in tanımlanması
        Scanner inp = new Scanner(System.in);

        //Değişkenlerin oluşturulması
        double Fiyat, KDVFiyat, KDVDeger;

        //Verilerin Kullanıcıdan Alınması
        System.out.println("Fiyatı Giriniz : ");
        Fiyat = inp.nextInt();

        //Verilerin Hesaplanması
        KDVFiyat = Fiyat * 1.18;
        KDVDeger = Fiyat * 0.18;

        //Sonucu Ekrana Yazdırma
        System.out.print("KDV'siz Fiyat : " + Fiyat + "\nKDV'li Fiyat : " + KDVFiyat + "\nKDV Değeri : " +KDVDeger );

    }
}