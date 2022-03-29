package Taksimetre;
/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
import java.util.Scanner;
public class TaksimetreUcretHesaplama {
    public static void main(String[] args) {

        Scanner VeriAl = new Scanner(System.in);

        //Değişken Tanımlama
        int km;
        double perKm = 2.20, total;

        //Kullanıcıdan Veri Ala
        System.out.print("Mesafeyi KM olarak oiriniz : ");
        km = VeriAl.nextInt();


        total = (km * perKm);
        total += 10;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar : " + total);

    }
}
