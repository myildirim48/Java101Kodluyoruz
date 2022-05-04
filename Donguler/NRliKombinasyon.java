package Donguler;
import java.util.Scanner;
public class NRliKombinasyon {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n,r,formul;

        System.out.print("C(n,r) için n değeri : " );
        n = scan.nextInt();
        System.out.print("C(n,r) için r değeri : ");
        r = scan.nextInt();

        int nFak=1;
        int rFak=1;
        int nrFak=1;


        for (int i=1; i<=n; i++){
            nFak = nFak * i;
        }
        for (int j=1; j<=r; j++){
            rFak = rFak * j;
        }
        for (int k=1; k<=n-r; k++){
            nrFak = nrFak *k;
        }

        formul=(nFak / (rFak*nrFak));
        System.out.print("Kombinasyon Formülü : " + formul);

    }
}
