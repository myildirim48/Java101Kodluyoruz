package ManavKasaProgrami;

import java.util.Scanner;
public class Manav101Programi {
    public static void main(String[] args) {

        Scanner VeriAl = new Scanner(System.in);

        //Değişken Tanımlama
        Double armut = 2.14, elma =3.67, domates=1.11, muz=0.95, patlican=5.00 ;
        int meyve1,meyve2,meyve3,meyve4,meyve5;

        //Kullanıcıdan Veri Alma
        System.out.print("Armut Kaç Kilo ? :");
        meyve1 = VeriAl.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        meyve2 = VeriAl.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        meyve3 = VeriAl.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        meyve4 = VeriAl.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        meyve5 = VeriAl.nextInt();

        //Toplamı Hesaplama

        double toplam= (armut * meyve1) + (elma * meyve2) + (domates * meyve3) + (muz * meyve4) + (patlican * meyve5);
        System.out.print("Toplam Tutar : " +toplam+" TL");


    }
}
