package day02_Variable;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen uc basamaklı bır sayı gırınız :");
        int sayı = input.nextInt();
        System.out.println("birler basamagı :"+sayı%10);
        System.out.println("onlar basamagı :" +(sayı/10)%10);
        System.out.println("yuzler basamagı :"+sayı/100);
    }

}
