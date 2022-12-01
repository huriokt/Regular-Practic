package day07StringManipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {
          /*

ctrl + alt gr + l :sayfayi duzenler
\n  : alt satira gecirir
\t  : 1 tab bosluk birakir
\b  : gerisindeki harfi siler
\\  : \ (ters slash) yazdirir   prints a back slash
\'  : ' tek tirnak yazdirir.  prints single quote
\"  : " cift tirnak yazdirir. : prints double quote

                              */
/*
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */
//havva ==> leght=5  //index=4
//
//        String cumle = "Bugun havva yagmurlu";
//        System.out.println(cumle.length());
//        String str1 = "";
//        System.out.println(str1.length());
//        String str2 =  " ";
//        System.out.println(str2.length());

        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz :");
//        String isim = input.nextLine();
//        System.out.println("Lutfen  soy isminizi giriniz");


//        String soyIsim=input.nextLine();
//
//        if(isim.length()>soyIsim.length()){
//            System.out.println("isim daha uzun");
//        }else if(isim.length()==soyIsim.length()){
//            System.out.println("isim ve soyisim esit uzunluktADIR");
//        }else {
//            System.out.println("Soyisim daha uzun");
//        }
// Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        System.out.println("Lutfen dort harfli bir kelime giriniz : ");

        String kelime1 = input.nextLine();

        System.out.print(kelime1.charAt(kelime1.length()-1));
        System.out.print(kelime1.charAt(kelime1.length()-2));
        System.out.print(kelime1.charAt(kelime1.length()-3));
        System.out.println(kelime1.charAt(kelime1.length()-4));



        //2.YOL
        Scanner inputt = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz...");
        String kelime= inputt.next();
        if( kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("tersten yazilmis hali;"+dort+uc+iki+bir);


        }else if(kelime.length()<4||kelime.length()>4){
            System.out.println("yanlis veri girdiniz");
        }

    }
}
