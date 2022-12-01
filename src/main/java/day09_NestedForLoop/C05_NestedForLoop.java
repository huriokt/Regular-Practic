package day09_NestedForLoop;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz,
// bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String str= input.nextLine();
   //     String newstr = "";

        for (int i = 0; i < str.length(); i++) {//ifadenin karakterlerine bakildi

            if ((str.charAt(i) == 'a') || (str.charAt(i) == ' ')) {
                continue;
            } else {
                System.out.print(str.charAt(i));
      //          newstr += str.charAt(i);

            }

        }
   //     System.out.println(newstr);























    }
}
