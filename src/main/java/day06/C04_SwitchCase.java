package day06;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun sayisi 1\tPazartesi 2\tSali 3\tCarsamba 4\tPerdembe 5\tCuma 6\tCumartesi 7\tPazar "+
                "Haftanin kacinci gununde oldugunuzu yazinizgiriniz");
        int gun = input.nextInt();
        if (gun<=0||gun>7){
            System.out.println("Hatali veri girisi");
        }else {
            System.out.println("Kac gun sonrasini bilmek istiyorsunuz");
            int gunSonra = input.nextInt();
            int sonGun= (gun+gunSonra)%7;
            switch (sonGun){
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 0:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("Gecerli bir gun giriniz");


                    }


        }










        }





    }

