package day09_NestedForLoop;

import java.util.Scanner;

public class C06_SayilarToplamiBesyuz {
    public static void main(String[] args) {

 /*    Kullanicidan toplanmak uzere sayilar isteyin.
       Sayi adedi 10'u gecerse yada toplami 500'u gecerse
     " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin              */

        Scanner input = new Scanner(System.in);


        int add = 0;
        int counter = 1;


        while (counter < 11 && add < 500) {

            System.out.println("Lutfen toplamini almak icin " + counter + ". sayiyi giriniz :");
            int num = input.nextInt();
            add += num;
            counter++;
        }

        if (add > 500) {
            System.out.println( counter + " adet sayi girdiniz toplami " + add + "  eder");
        }else
            System.out.println(" Bu kadar sayi yeter " + counter + " adet sayi girdiniz toplami " + add + "  eder");






























    }
            }
