package day07StringManipulations;

import java.util.Scanner;

public class C01_StringManipulatinsConcat {
    public static void main(String[] args) {

        /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

            System.out.println(15 + 20 + "Merhaba");//35Merhaba
            System.out.println("Merhaba" + 15 + 20);//Merhaba1520
            System.out.println("Merhaba" + (15 + 20));//Merhaba35
            System.out.println("Merhaba" + 15 * 20);//Merhaba300

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lytfen tam isminizi giriniz : ");

        String isim = input.nextLine().toUpperCase();
        System.out.println("isim soyisim = " + isim);

        //2.Yol
        String isiim = input.nextLine(),soyIsim=input.nextLine();//Multiple declaration==coklu tanimlama
        String tamIsim = isim.concat(" "+soyIsim).toUpperCase();
        System.out.println("tamIsim = "+tamIsim);

        }


    }

