package Donguler;


import java.util.Scanner;
public class GirilenArmStrongSayisiMı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber,tempUserNumber;

        System.out.println("Girilen Sayı Armstron Sayısı Mı ? ");
        System.out.print("Saı Giriniz : ");
        userNumber = input.nextInt();


       int numberCounter = 0;
       tempUserNumber = userNumber;   /* Girilen Sayının Basamak Sayısını Öğrenme*/

       while(tempUserNumber !=0){
           tempUserNumber/=10;

           numberCounter++;
       }

                                    /* Girilen Sayının  Son Basamağı ve Basamak Değerlerini Öğrenme*/
        tempUserNumber=userNumber;
        int basValue;
        int basPow;
        int result=0;

        while (tempUserNumber !=0){
            basValue = tempUserNumber % 10;

            basPow = 1;
                for (int i = 1; i<=numberCounter ; i++){
                   basPow *= basValue;
            }
                result += basPow;
            tempUserNumber /= 10;
        }

       if (result == userNumber){
           System.out.print(userNumber + " sayısı bir Armstrong sayısıdır.");
       }else {
           System.out.print(userNumber + " sayısı bir Armstrong sayısı değildir.");
       }


    }
}
