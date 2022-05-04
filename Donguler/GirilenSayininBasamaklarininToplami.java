package Donguler;
import  java.util.Scanner;
public class GirilenSayininBasamaklarininToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,tempnumber;
        System.out.print("Girilen Sayının Basamaklarının Toplamını Bulan Program\n Bir Sayı Giriniz : ");
        number =input.nextInt();
        tempnumber=number;
        int basValue=0;
        int total=0;
        while (number!=0){
            basValue = number % 10;

            total +=basValue;
            number /=10;
        }
        System.out.print( tempnumber + " sayısının basamaklarının toplamı : " + total);
    }
}
