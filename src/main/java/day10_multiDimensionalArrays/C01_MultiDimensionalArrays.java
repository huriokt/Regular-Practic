package day10_multiDimensionalArrays;

import java.util.Scanner;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
     //  Bir String' deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");

        String str = input.nextLine().toLowerCase();


        for (int i = 0; i < str.length(); i++) {
           str = str.replaceAll("[^aeiou]", "");

        }
        System.out.println(str);
        System.out.println();
//////////////////////Arays yontemi///////////////
        int idx = 0 ;

        String arr[] = str.split("");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("a")||
           arr[i].equalsIgnoreCase("e")||
           arr[i].equalsIgnoreCase("i")||
         arr[i].equalsIgnoreCase("o")||
            arr[i].equalsIgnoreCase("")){
                System.out.print(arr[i]);
            }




        }



    }
}
