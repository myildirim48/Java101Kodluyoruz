package BuyuktenKucugeSiralama;

import  java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı : " );
        a = input.nextInt();
        System.out.print("2.Sayı : ");
        b = input.nextInt();
        System.out.print("3.Sayı : ");
        c = input.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.print("A < B < C");
            }else {
                System.out.print("A < C < B");
            }
        }else if ((b<a) && (b<c)){
            if (a<c){
                System.out.print("B < A < C");
            }else {
                System.out.print("B < C < A");
            }
        }else if ((c<a) && (c<b)){
            if (a<b){
                System.out.print("C < A < B");
            }else {
                System.out.print("C < B < A");
            }
        }

    }
}
