package Donguler;
import java.util.Scanner;
public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();
        int total=1;

        for (int i = 1; i<=k; i++){
           total = total *i;
           }
        System.out.print(total);
    }
}
