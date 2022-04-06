package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz :");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();


        switch(select){
            case 1 :
                System.out.print("Toplam : " + (number1 + number2));
            break;

            case 2:
                System.out.print("Çıkarma : " + (number1 - number2));
            break;

            case 3:
                System.out.print("Çarpma : " + (number1 * number2));
            break;

            case 4:
                if (number1 == 0 || number2 == 0) {

                    System.out.print("Bir Sayı Sıfıra Bölünemez");
                }else{
                    System.out.print("Bölme : " + (number1 / number2));
                }

            break;

            default:
                System.out.print("Yanlış Seçim Yaptınız...");

        }

}
    }
