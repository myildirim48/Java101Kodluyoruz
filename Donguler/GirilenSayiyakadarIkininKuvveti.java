package Donguler;
import java.util.Formattable;
import java.util.Scanner;
public class GirilenSayiyakadarIkininKuvveti {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n ;

        System.out.print("Sınır Sayısını Giriniz : ");
        n = scan.nextInt();

        for (int i =1 ; i <= n; i *= 2){
            System.out.println(i);
        }
    }
}
