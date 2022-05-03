package UcakBiletiOdevi;
import java.util.Scanner;
public class UcakBiletiOdevi {
    public static void main(String[] args) {
        int distance,age,tripType,discount;
        double totalPrice;
        Scanner input=new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafe : ");
        distance=input.nextInt();

        System.out.print("Yaşınız : ");
        age=input.nextInt();

        System.out.print("Yolculuk Tipi 1-Tekyön 2-Gidiş Geliş : ");
        tripType=input.nextInt();

        if (distance>0 && age>0 && tripType==1 || tripType==2){
            totalPrice=(distance*0.10);
            switch (tripType){
                case 1:
                if (age<12){
                totalPrice=totalPrice*.5;
                System.out.print("Toplam Fiyat : "+totalPrice);
            }else if(age>12 && age<24){
                totalPrice=totalPrice - (totalPrice * 0.1);
                System.out.print("Toplam Fiyat : "+totalPrice);
            }else if (age>65){
                totalPrice=totalPrice - (totalPrice*0.3);
                System.out.print("Toplam Fiyat : "+totalPrice);
            }else{
                    System.out.print("İndirim Sınıfına Girmiyorsunuz Fiyat : "+totalPrice+" TL");
                }break;
                case 2:
                    totalPrice=totalPrice*2;
                    if (age<12){
                        totalPrice=totalPrice*.5;
                        totalPrice=totalPrice-(totalPrice*0.2);
                        System.out.print("Toplam Fiyat : "+totalPrice);
                    }else if(age>12 && age<24){
                        totalPrice=totalPrice - (totalPrice * 0.1);
                        totalPrice=totalPrice-(totalPrice*0.2);
                        System.out.print("Toplam Fiyat : "+totalPrice);
                    }else if (age>65){
                        totalPrice=totalPrice - (totalPrice*0.3);
                        totalPrice=totalPrice-(totalPrice*0.2);
                        System.out.print("Toplam Fiyat : "+totalPrice);
                    }else{
                        System.out.print("İndirim Sınıfına Girmiyorsunuz Fiyat : "+totalPrice+" TL");
                    }break;

            }

        }else{
            System.out.print("Hatalı Veri Girdiniz.");
        }
    }
}
