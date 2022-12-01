package day02_Variable;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ex1:
//        System.out.println("Lutfen yarıçapı giriniz : ");
//        double yarıCap = input.nextDouble();
//        System.out.println("Çemberin çevresi :" +(2*3.14*yarıCap));
//        System.out.println("Dairenın alanı : "+ 3.14*yarıCap*yarıCap);

        //Ex2:

//        System.out.println("Lütfen dıkdortgenın uzun kenarını giriniz");
//        double kısaKenar = input.nextDouble();
//        System.out.println("Lutfen uzun kenarı giriniz");
//        double UzunKenar =input.nextDouble();
//        System.out.println("dıkdortgenın alanı :" +(UzunKenar*kısaKenar));
//        System.out.println("dikdortgenın cevresi :"+(UzunKenar+kısaKenar)*2);

        //    Ex3:

//        System.out.println("Lütfen ucgenın uc kenarını giriniz : ");
//        byte birinciKenar = input.nextByte();
//        byte ikinKenar = input.nextByte();
//        byte uçuncuKenar = input.nextByte();
//        System.out.println("Ucgenin cevresi :" + (birinciKenar + ikinKenar + uçuncuKenar));

//        //Ex4:Kullanıcıdan alınan kodla  A
//                                         AA
//                                         AAA
        System.out.println("Lutfen bir harf giriniz");
        char harf = input.next().charAt(0);
        System.out.println(" "+harf+" ");
        System.out.println(""+harf+harf);
        System.out.println(""+harf+harf+harf);






    }

}
