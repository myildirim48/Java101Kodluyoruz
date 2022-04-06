package HesapMakinesi;

import java.util.Scanner;
public class HesapMakinesiIfElse {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz");
        number2 = input.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma\n 4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        if (select == 1) {
            System.out.print("Toplam : " + (number1 + number2));
        } else if (select == 2) {
            System.out.print("Çıkarma : " + (number1 - number2));
        }else if(select == 3){
            System.out.print("Çarpma : " + (number1 * number2));
        }
        else if(select == 4) {
            if (number2 !=0 ){
            System.out.print("Bölme : " + (number1 / number2));}
            else {
                System.out.print("Bir Sayı Sıfıra Bölünemez");
            }
        }
        else {
            System.out.print("Yanlış Seçim Yaptınız...");
        }
    }
}
