package SınıfGecmeDurumu;

import java.util.Scanner;

public class SinifGecmeOdev {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,avarage = 0;
        double counter=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100100){
            avarage = (avarage + mat);
        }else {
            counter+=1;
        }


        System.out.print("Türkçe Notunuz : ");
        fizik = input.nextInt();

        if (fizik>=0 && fizik<=100){
            avarage = (avarage + fizik);
        }else {
            counter+=1;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        if (kimya>=0 && kimya<=100){
            avarage = (avarage + kimya);
        }else {
            counter+=1;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        if (turkce>=0 && turkce<=100){
            avarage = (avarage + turkce);
        }else {
            counter+=1;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if (muzik>=0 && muzik<=100){
            avarage = (avarage + muzik);
        }else {
            counter+=1;
        }

        int NotAvarage = (avarage / 5);
        if (NotAvarage <55){
            System.out.println("Sınıfta Kaldınız. Ortalamanız : " + NotAvarage );
            if (counter>0){
                System.out.print(counter + " Tane dersin notlarını yanlış girdiniz.");
            }

        }else {
            System.out.print("Tebrikler Sınıfı Geçtiniz. Ortalamanız : "+ NotAvarage );
            if (counter>0){
                System.out.print(counter + " Tane dersin notlarını yanlış girdiniz.");
            }
        }
    }
}
