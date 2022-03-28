package KDVTutarıOdevi;

import java.util.Scanner;

public class BineKadarKDVODevi {
    public static void main(String[] args) {
        //Scanner'in tanımlanması
        Scanner inp = new Scanner(System.in);

        //Degiskenler
        Double Fiyat,KDVliFiyati,KDV;

        //Kullanıcıdan Veri Alınması
        System.out.print("Fiyatı Giriniz : ");
        Fiyat = inp.nextDouble();

        //KDV Oranı
        Double KDVOran = Fiyat <= 1000 ? 0.18 : 0.8;

        //Hesaplama
        KDV = Fiyat * KDVOran;
        KDVliFiyati = KDV + Fiyat;

        //Ekrana Veri Yazdırma
        System.out.println("KDV'siz Fiyat : " + Fiyat);
        System.out.println("KDV Oranı : " + KDVOran);
        System.out.println("KDV Tutarı : " + KDV);
        System.out.println("KDV'li Fiyat : " + KDVliFiyati);



    }
}
