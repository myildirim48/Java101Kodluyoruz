package Donguler;
import java.util.Scanner;

public class GirilenSayiyaKadarDortveBesinKuvvetleriODEV {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int k;
        System.out.print("Sınırı Giriniz : ");
        k = input.nextInt();

        System.out.print("4'ün Katları  "+ k +" olana kadar : ");
        for (int i = 4; i <= k; i *= 2 ){
            System.out.print("\t"+i);
        }
        System.out.println();

        System.out.print("5'in Katları  "+ k +" olana kadar : ");
        for (int j = 5; j <= k; j *= 2 ){

            System.out.print("\t" +j);
        }
    }
}
