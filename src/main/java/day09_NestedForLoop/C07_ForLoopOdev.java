package day09_NestedForLoop;

public class C07_ForLoopOdev {
    public static void main(String[] args) {

//Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        for (int satir = 1; satir <7; satir++) {//satir kontrolu
            for (int bosluk = 1; bosluk < satir; bosluk++) {//bosluk yazdirma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6 ; rakam++) {//sutun kontrolu
                System.out.print(rakam + " ");

            }
            System.out.println();
        }














    }
}
