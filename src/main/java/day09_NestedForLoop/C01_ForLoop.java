package day09_NestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

          /*   Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız. *Kalacittan *alacali*/


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String str = input.nextLine();
        int counter = 0 ;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {

                counter++;

            } else if (str.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println(counter);


//        int a = str.indexOf("a");
//        int c = str.indexOf("c");
//            if(str.contains("a")){
//            counter++;
//            }
//            if(c>a){
//                break;
//                }




    }
}
