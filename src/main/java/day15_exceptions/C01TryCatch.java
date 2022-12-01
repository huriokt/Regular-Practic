package day15_exceptions;

public class C01TryCatch {
    // Verilen iki sayiyi 10 kez bolen kodu yaziniz
    public static void main(String[] args) {
        int sayi1 = 100;
        int sayi2 = 5;




  /*
       while (sayac<10){
            System.out.println(sayi1/sayi2);
            sayi2--;
            sayac++;*/

        //   1.Yol
//        int sayac=1;
//        while (sayac<11) {
//            if (sayi2 == 0) {
//                System.out.println("Islem yapilirken payda sifir olamaz");
//            } else
//                System.out.println(sayi1 / sayi2);
//            sayi2--;
//            sayac++;
//        }

//2.YOl

        int sayac = 1;


            while (sayac < 11) {

                try {
                    System.out.println(sayi1 / sayi2);

                } catch (ArithmeticException e) {
                    System.out.println("Islem yapilirken payda sifir olamaz");
                    System.err.println("Islem yapilirken payda sifir olamaz");
        //            e.printStackTrace();

                }
                sayi2--;
                sayac++;

            }}


}






