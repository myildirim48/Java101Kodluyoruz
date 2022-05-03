package Donguler;
import java.util.Scanner;
public class GirilenDegerlerinCiftveDortKatlariToplamiODEV {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int n,sum=0;

        do {
            System.out.print("Sayı Giriniz : ");
            n=scan.nextInt();

            if (n % 2 == 0 && n % 4 ==0){
                sum += n;
            }

        }while(n % 2 == 0);

        System.out.print("Çift ve 4'e bölünen sayılar : " + sum);
    }
}
