package DaireAlanCevresi;
import java.util.Scanner;
public class DaireDilimininAlani {
    public static void main(String[] args) {

        Scanner VeriAl = new Scanner(System.in);

        //Değişkenlerin Tanımlanması
        double r, a, DilimAlan,pi = 3.14;

        //Kullanıcıdan Veri Alma
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = VeriAl.nextDouble();
        System.out.print("Dairenin Merkez Açı Ölçüsünü Giriniz :  ");
        a = VeriAl.nextDouble();

        //Formül
        DilimAlan = (pi*(r*r)*a)/360;
        System.out.print("Daire Dilminin Alanı : " + DilimAlan);

    }
}
