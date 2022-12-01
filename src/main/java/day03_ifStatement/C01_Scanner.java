package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir işçi bıtırme suresını gırınız:" );
        double bıtırmeSuresi = input.nextDouble();
        System.out.println("lutfen toplam işci sayısını giriniz: ");
        double işçiSayısı = input.nextDouble();
        System.out.println("bitirme suresi:" +bıtırmeSuresi/işçiSayısı);

    }
}
