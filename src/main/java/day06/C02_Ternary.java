package day06;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu 'A','B','C' seklinde giriniz");
        char not = input.next().toLowerCase().charAt(0);

        switch (not){
            case 'a':
                System.out.println("Cok basarili");
                break;
            case 'b':
                System.out.println("Basarili");
                break;
            case 'c':
                System.out.println("Orta");
                break;
            default:
                System.out.println("Digerleri");




        }


    }

}
