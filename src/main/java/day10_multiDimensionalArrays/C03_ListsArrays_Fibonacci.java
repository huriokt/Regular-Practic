package day10_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ListsArrays_Fibonacci {
    public static void main(String[] args) {
  /*              INTERWIEW  Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
                0-1-1-2-3-5-8-13-21-34....                                     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi  giriniz :");
        int sayi = input.nextInt();

        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("Lutfen 1'den buyuk bir sayi giriniz :");

        } else {

            while (fib.get(i) < sayi) {
                fib.add(fib.get(i) + fib.get(i - 1));//bir onceki eleman ile topladik

                i++;//bir sonraki elemana gectik

            }
            if ((fib.get(fib.size() - 1 ))> sayi){///fibonaccide yer almiyor ise
                fib.remove(fib.size() - 1);//son elemani sil
                System.out.println("Girdiginiz sayi fibonaccide yer almiyor.Girilen sayiya kadarki fibonacci sayilari "+fib);
            }else{
                System.out.println("Girdiginiz sayi fibonaccide sayisidi"+fib);
            }
        }


    }
}
