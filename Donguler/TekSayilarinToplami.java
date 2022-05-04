package Donguler;
import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int Ksayi,sum=0;

        do {
            System.out.print("Sayı Giriniz : ");
            Ksayi=scan.nextInt();

            if (Ksayi % 2 == 1){
                sum+=Ksayi;
            }

        }while (Ksayi>0);

        System.out.println("Toplam : " + sum);
    }
}
