package SınıfGecmeDurumu;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double avarage = (mat+fizik+turkce+kimya+muzik) / 5;

        if (avarage <=55){
            System.out.println("Sınıfta Kaldınız. Seneye Görüşmek Üzere");
        }else{
            System.out.print("Sınıfı Geçtiniz.");
        }

        System.out.print("Ortalamanız : " + avarage);
    }
}
