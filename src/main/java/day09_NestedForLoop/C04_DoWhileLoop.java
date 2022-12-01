package day09_NestedForLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

  /*    Adada yalnız bir maymun var. Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var.

        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;                                         */
        //Maymunun kac gun hayatta kalacagini gosteren kod
        //Hayatta kaldigi suerece muz vermelisin(DO While)
        //eger 4 ten az muz kalirsa maymunlar olur


        int muzSayısı = 165, hayattaKalmaDays = 0;
        boolean maymunAlive = true;

        do {

            muzSayısı -= 4;//hergun 4 muz eksiltir
            hayattaKalmaDays++;
            if (muzSayısı<4){
                maymunAlive=false;
                System.out.println("bugun "+hayattaKalmaDays+" gun yasayamadi muz kalmadi.Maymun oldu"  );
            }else {
                System.out.println("bugun " + hayattaKalmaDays + "gun yasadi muz kalmadi.Maymun yasiyor");

            }
        } while (maymunAlive);
        System.out.println("Hayatta kalma suresi " + hayattaKalmaDays);
        System.out.println();





    }
}
