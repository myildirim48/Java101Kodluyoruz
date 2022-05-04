package Donguler;
import  java.util.Scanner;
public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k,n;
        System.out.print("Üslü Sayı Hesaplama \n Sayıyı Giriniz : ");
        k = input.nextInt();
        System.out.print("Üs sayısını girin : ");
        n = input.nextInt();

        int total=1;
        int i = 1;
        while (i <= n){
            total *= k;
            i++;
        }
        System.out.print(k+" Üzeri " + n +" = "+ total);
    }
}
