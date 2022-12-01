package day09_NestedForLoop;

import java.util.Scanner;

public class kntr {
    public static void main(String[] args) {








        for (int satir = 1; satir <= 6; satir++) {//satır kontrolü
            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
                System.out.print(rakam + " ");
            }
            System.out.println();
        }












    }





}
