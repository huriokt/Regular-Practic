package day07StringManipulations;

public class C05StringManipulationsEmpty {
    public static void main(String[] args) {
        String str1= "Hi";
        System.out.println(str1.isEmpty());//false
        String str2 = "";
        System.out.println(str2.isBlank());//true
        String str3 = " ";
        System.out.println(str3.isEmpty());//f
        System.out.println(str3.isBlank());//t

        String k = "Saa det";
        if (k.isEmpty()){
            System.out.println("bosluk var");
        }else {
            System.out.println("bosluk yok");
        }




    }
}
