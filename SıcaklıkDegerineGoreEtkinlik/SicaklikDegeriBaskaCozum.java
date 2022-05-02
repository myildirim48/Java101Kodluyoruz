package SıcaklıkDegerineGoreEtkinlik;

import java.util.Scanner;
public class SicaklikDegeriBaskaCozum {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }
            if (heat >= 5 && heat < 25) {
                    if (heat <= 15) {
                        System.out.println("Sinemaya Gidebilirsiniz.");
                    }else if (heat<25){
                        System.out.print("Pikniğe Gidebilirsiniz.");
                    }
                }
        else{
            System.out.print("Yüzmeye Gidebilirsiniz.");
        }
    }
}