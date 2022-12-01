package day10_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MDArrays_MaxMin {
    public static void main(String[] args) {
    //Kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının  farkını bulan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen array eleman sayisini giriniz :");

        int elemansayisi = input.nextInt();

        int arr[] = new int[elemansayisi];


        for (int i = 0; i < elemansayisi; i++) {
            System.out.println("Lutfen array in " + (i+1) + "  elemanini giriniz :");

            arr[i] = input.nextInt();
        }
       System.out.println(Arrays.toString(arr));

          Arrays.sort(arr);
//        System.out.println(" Array'in en buyuk elemani :"+arr[elemansayisi-1]);//Arrayin en buyuk lemanini verir
//        System.out.println(" Array'in en kucuk elemani :"+arr[0]);//Array'in en kucuk elemanini verir
//        System.out.println(arr[elemansayisi-1]-arr[0]);
            int  fark  =arr[elemansayisi-1] -arr[0];
            System.out.println(fark);


        }


    }



