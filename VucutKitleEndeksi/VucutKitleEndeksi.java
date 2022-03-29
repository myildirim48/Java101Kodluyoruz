package VucutKitleEndeksi;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner VeriAl = new Scanner(System.in);

        //Değişkenler
        double boy,kilo,indeks;

        //Kullanıcıdan Veri Alma
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = VeriAl.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = VeriAl.nextDouble();

        //Formül
        indeks = kilo / (boy * boy);

        //Sonuc Yazdırma
        System.out.print("Vücut Kitler İndeksiniz : " + indeks);



    }
}
