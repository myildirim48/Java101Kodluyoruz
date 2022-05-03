package ArtikYilHesaplama;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year,mod;

        System.out.print("Yıl Giriniz : ");
        year=input.nextInt();


        if (year%100==0){
            if (year%400==0){
                System.out.print("Artık Yıldır");
            }else {
                System.out.print("Artık Yıl Değildir.");
            }
        }else if (year%4==0){
            System.out.print("Artık Yıldır.");
        }else {
            System.out.print("Artık Yıl Değildir.");
        }
    }
}
