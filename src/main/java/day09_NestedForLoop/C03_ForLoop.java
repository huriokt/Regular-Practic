package day09_NestedForLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

//EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
   /*       tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||                                                     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen agacin tac uzunlugunu giriniz :");
         int t = input.nextInt();
         String yaprak = "";


        for (int i = 0; i < t; i++) {
            yaprak += "^";
            System.out.println(yaprak);

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("|||");

        }




         //2.YOL
//        for (int i = 0; i < t; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("^");
//
//            }
//            System.out.println();
//        }
//        int s=3;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("|");
//
//            }
//            System.out.println();
//        }
































    }
}
