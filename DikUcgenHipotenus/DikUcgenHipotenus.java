package DikUcgenHipotenus;

import java.util.Scanner;

public class DikUcgenHipotenus {
    public static void main(String[] args) {
        //Değişkenleri Oluşturalım
        int a,b;
        double c;

        //Kullanıcıdan Verileri Alalım
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);

    }


}
