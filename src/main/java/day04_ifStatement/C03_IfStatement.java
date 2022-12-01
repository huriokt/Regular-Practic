package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //1.Yol

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bır gun ısmı gırınız : ");
        String gun = input.next().toLowerCase();

//        if(gun.equalsIgnoreCase("cuma")){
//            System.out.println("Muslumanlar ıçın kutsal gun");
//        }if(gun.equalsIgnoreCase("cumartesi")){
//            System.out.println("Yahudiler ıçın kutsal gun");
//        }if(gun.equalsIgnoreCase("pazar")){
//            System.out.println("Hrıstıyanlar ıçın kutsal gun");
//        }if(!gun.equalsIgnoreCase("cuma")&&!gun.equalsIgnoreCase("cuma")
//                &&!gun.equalsIgnoreCase("pazar")){
//            System.out.println("Kutsal gun degil");
//        }
 //       2.YOL

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar ıçın kutsal gun");
        }if(gun.equals("cumartesi")){
            System.out.println("Yahudiler ıçın kutsal gun");
        }if(gun.equals("pazar")){
            System.out.println("Hrıstıyanlar ıçın kutsal gun");
        }if(!gun.equals("cuma")&&!gun.equals("cuma")
                &&!gun.equals("pazar")) {
            System.out.println("Kutsal gun degil");


        }

    }

 }
