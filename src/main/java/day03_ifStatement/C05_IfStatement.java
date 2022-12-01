package day03_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama işlemi için 1 \n ıkarma işlemi için 2\n bolme işlemi için 3 \n carpma işlemi için 4 \n gırınız:");
        int işlem = input.nextInt();
        System.out.println("Lutfen iki tam sayı giriniz:");
        double sayı1 = input.nextDouble();
        double sayı2 = input.nextDouble();
        if(işlem==1){
            System.out.println("sayıların toplamı :"+sayı1+"+"+sayı2+"="+(sayı1+sayı2));
        }else if(işlem==2){
            System.out.println("sayıların farkı :"+(sayı1-sayı2));
        }else if(işlem==3){
            System.out.println("sayıların bolumu :"+(sayı1/sayı2));
        }else if(işlem==4){
            System.out.println("sayıların carpımı :"+(sayı1*sayı2));
        }else {
            System.out.println("gecerli bir sayı gırınız");
        }








    }
}
