package day09_NestedForLoop;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {


  /*
                ooooo*
                oooo* *
                ooo*   *
                oo*     *
                o* * * * *                                                        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz :");
        int satir = input.nextInt();


        for (int i = 1; i <=satir ; i++) {
            for (int bosluk  = satir; bosluk >=i ; bosluk --) {//bosluk kontrol konsoldan uzaklastir en ust satirdaki 5,4,3 soldaki bosluk
                System.out.print(" ");//o

            }
            for (int sutun = 1; sutun <= i ; sutun++) {
                if(sutun==1||sutun==i){
                    System.out.print("* ");//en distaki yildizlar
                } else if (i==satir) {
                    System.out.print("* ");//en alt satirdaki bosluk

                }else {
                    System.out.print("  ");//3. ve 4. siradaki bosluklar
                }

            }
            System.out.println();
        }



























    }
}
