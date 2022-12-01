package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
       // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi pozitif sayi olarak  giriniz : ");
        int yas = input.nextInt();
//        if(yas>= 65){
//            System.out.println("Emekli olabilirsin");
//        }else {
//            System.out.println("Emekli olamazsin "+(+65-yas)+" yil daha calismalisin");
//        }

        //2.YOL
        if(yas>=0){
            if(yas>= 65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin "+(+65-yas)+" yil daha calismalisin");
            }
        }else {
            System.out.println("Lutfen yasinizi pozitif giriniz.");
        }

    }
}
