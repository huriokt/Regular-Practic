package day05_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

//Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz :");
        double sayi1= input.nextDouble();
        double sayi2 = input.nextDouble();
        if(sayi1>sayi2){
            System.out.println("buyuk olmayan sayiyi"+sayi2);

        }if (sayi1<sayi2){
            System.out.println(" buyuk olmayan sayiyi"+sayi1);
        }else {
            System.out.println("Sayilar esittir");
        }
  //      System.out.println(sayi1==sayi2?"Sayilar esittir":sayi1>sayi2?sayi2:sayi1);


    }
}
