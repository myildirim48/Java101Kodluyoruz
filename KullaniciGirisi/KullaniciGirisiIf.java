package KullaniciGirisi;

import java.util.Scanner;
public class KullaniciGirisiIf {
    public static void main(String[] args) {
        String userName,password,sifreIstek,yeniSifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız !");
        }else{
            System.out.print("Bilgileriniz Yanlış ! ");

            System.out.print("Yeni Şifre Oluşturmak için Evet/Hayır yazınız : ");
            sifreIstek = input.nextLine();

            if (sifreIstek.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz : ");
                yeniSifre = input.nextLine();

                if(yeniSifre.equals("java123")) {
                    System.out.print("Şifre Oluşturulamadıi lütfen başka şifre giriniz..");

                }
                else {
                    System.out.print("Şifreniz Oluşturuldu...");
                }

            }else {
                    System.out.print("İyi Günler...");
            }
        }
    }
}
