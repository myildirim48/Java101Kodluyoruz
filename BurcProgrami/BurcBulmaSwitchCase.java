package BurcProgrami;
import java.util.Scanner;

public class BurcBulmaSwitchCase {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();

        if (month<1 || month>12){
            System.out.println("Hatalı Ay Girdiniz.");
        }else {

        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

            if (day<1 || 31>12){
                System.out.println("Hatalı Gün Girdiniz.");
            }else {

            switch (month){
                case 1:
                     if(day >= 1 && day <= 31){
                        if (day<=21){
                            burc = "Oğlak";
                        }else {
                            burc = "Kova";
                        }
                     }else {
                         isError = true;
                     }
                break;

                case 2:
                    if (day >= 1 && day <= 28){
                        if (day >= 20){
                            burc = "Kova";
                        }else {
                            burc = "Balık";
                        }

                    }else {
                        isError = true;
                    }
                break;
                case 3:
                    if (day >= 1 && day <= 31) {
                        if (day >= 21) {
                            burc = "Koç";
                        }else {
                            burc = "Balık";
                        }
                    }else {
                        isError = true;
                    }
                break;

                case 4 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 21) {
                            burc = "Boğa";
                        } else {
                            burc = "Koç";
                        }
                    }else {
                        isError = true;
                    }
                break;

                case 5 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 22) {
                            burc="İkizler";
                        }else{
                            burc="Boğa";
                        }
                    }else {
                        isError = true;
                    }
                break;

                case 6 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 23) {
                            burc="Yengeç";
                        }else{
                            burc="İkizler";
                        }
                    }else {
                        isError = true;
                    }
                break;

                case 7 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 23) {
                            burc="Aslan";
                        }else{
                            burc="Yengeç";
                        }
                    }else {
                        isError = true;
                    }
                    break;

                case 8 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 23) {
                            burc="Başak";
                        }else{
                            burc="Aslan";
                        }
                    }else {
                        isError = true;
                    }
                    break;

                case 9 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 23) {
                            burc="Terazi";
                        }else{
                            burc="Başak";
                        }
                    }else {
                        isError = true;
                    }
                    break;

                case 10 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 23) {
                            burc="Akrep";
                        }else{
                            burc="Terazi";
                        }
                    }else {
                        isError = true;
                    }
                    break;

                case 11 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 22) {
                            burc="Yay";
                        }else{
                            burc="Akrep";
                        }
                    }else {
                        isError = true;
                    }
                    break;

                case 12 :
                    if (day >= 1 && day <= 31) {
                        if (day >= 22) {
                            burc="Oğlak";
                        }else{
                            burc="Yay";
                        }
                    }else {
                        isError = true;
                    }
                    break;
            }

            if(isError){
                System.out.println("Burcunuz : " + burc);

            }

        }
        }
    }
}

