package day15_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
      /*
    Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
    Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
    (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
     */
        String[] urunler = {"Et", "Sut", "Findik", "Fistik"};
        Scanner input;
        boolean flag = true;

        int index = 0;


        while (flag) {

            try {
                input = new Scanner(System.in);
                System.out.println("Istediginiz urunun  sira numarasini giriniz");
                index = input.nextInt();

                flag = false;

            } catch (InputMismatchException e) { //Verilmesi gereken sayiyi vermedi hatasi
                e.printStackTrace();
            }}
        try {
            System.out.println(urunler[index]);//dukkanda olmayan buyk bir sayi girdiyse
        } catch (Exception e) {
       //     e.printStackTrace();
            System.out.println("Girdiginiz deger 0 ile 3 arasinda olmali");
        }



    }
    }
