package Donguler;
import java.util.Scanner;
public class UsluSayilarForODEV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k,n;
        System.out.print("Üssü Alınacak Sayı : ");
        k=input.nextInt();
        System.out.print("Üs Kaç Olsun : ");
        n=input.nextInt();

        int total=1;

        for (int i = 1; i<=n; i++)
        {
            total *= k;
        }
        System.out.print(k+" ^ "+n +" = "+ total);
    }
}
