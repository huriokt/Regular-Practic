package day07StringManipulations;

public class C02StringManipulationsSupstring {
    public static void main(String[] args) {

/** substring()
 //substring() in iki kullanimi vardir.
 //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
 //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
 */

            //1***** 10.index dahil sonuna kadra verilen Stringi yazdiriniz//ava gibi olsa
            String cumle = "Her dert Java gibi olsa";
            //2***** son 10 harfi yazdirin >>>>gibi olsa:
            //3***** ilk 10 karakteri alma
            //4***** 11.ci karakterden sonuna kadar olan Stringi yazdiralim

        System.out.println(cumle.substring(10));

       System.out.println(cumle.substring(cumle.length()-9));
        System.out.println(cumle.substring(0, 10));
        System.out.println(cumle.substring(10));


    }
}
