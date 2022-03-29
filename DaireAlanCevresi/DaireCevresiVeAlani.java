package DaireAlanCevresi;

import java.util.Scanner;
public class DaireCevresiVeAlani {
    public static void main(String[] args) {

        Scanner VeriAl = new Scanner(System.in);

        //Değişkenler
        double r, pi=3.14,alan,cevre;

        //Kullanıcıdan Dairenin Yarıçapını Almak
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = VeriAl.nextDouble();

        //Formül
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);


    }
}
