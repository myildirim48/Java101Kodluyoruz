package DikUcgenHipotenus;

/*Ödev
* Üç kenar uzunluğunu kullanıcıdan aldığımız üçgenin alanını hesaplıyoruz
*
* Formül
* Üçgenin Çevresi = 2u;
* u = (a+b+c) / 2
* Alan * Alan = u * (u - a) * (u - b) * (u - c)
* */

import java.util.Scanner;

public class UcKenarinAlindigiUcgenOdevi {

    public static void main(String[] args) {

        //Scanner Tanımlama
        Scanner VeriAl = new Scanner(System.in);

        //Değişken Tanımlama
        int a,b,c;
        double u, alan;

        //Kullanıcıdan Veri Alma
        System.out.print("Birinci Kenarı Giriniz : ");
        a = VeriAl.nextInt();

        System.out.print("İkinci Kenarı Giriniz : ");
        b = VeriAl.nextInt();

        System.out.print("Üçüncü Kenarı Giriniz : ");
        c = VeriAl.nextInt();

        //Formül
        u = ((a+b+c) / 2.0);
        System.out.println("Üçgenin Çevresi : " + (2.0 * u));

        alan = Math.sqrt(u * (u - a)*(u - b)*(u - c));
        System.out.println("Üçgenin Alani : " + alan);


    }
}
