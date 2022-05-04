package Donguler;
import java.util.Scanner;

public class GirilenSayiyaKadarBolunmeODEV {
    public static void main(String[] args) {
        int sayi1;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Sayı Giriniz : ");
            sayi1=input.nextInt();
        }

        for (int i=1; i<=sayi1; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
