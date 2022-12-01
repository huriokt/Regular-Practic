package day04_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

      Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y/N yazınız");
        char kullanıcıGırısı = input.next().charAt(0);

//        Character ıgn = Character.
        if (kullanıcıGırısı=='y'||kullanıcıGırısı=='Y'){
            System.out.println("Yes");
        }else if (kullanıcıGırısı=='n'||kullanıcıGırısı=='N'){
            System.out.println("No");
        } else {
            System.out.println("Lutfen dogru gırınız");
        }

    }
}
