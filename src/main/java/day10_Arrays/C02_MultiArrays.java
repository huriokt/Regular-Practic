package day10_Arrays;

public class C02_MultiArrays {
    public static void main(String[] args) {
        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
        // int arr2[][] = {{7, 8,9},{10,11 }, {12}};



         int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
         int arr2[][] = {{7, 8,9},{10,11}, {12}};

         int limit = 0;
         int toplam = 0 ;
          if(arr1.length<=arr2.length) {
              for (int i = 0; i < arr1.length; i++) {
                  limit = arr1[i].length;
                  if (arr1[i].length > arr2[i].length) {
                      limit = arr2[i].length;
                  }
                  for (int j = 0; j < limit; j++) {
                      toplam = arr1[i][j] + arr2[i][j];
                      System.out.println(i + "," + j + "index " + "toplami = " + toplam);
                  }
              }
          } else {

            for (int i = 0; i < arr2.length; i++) {
                limit=arr1[i].length;
                if (arr1[i].length>arr2[i].length){
                    limit=arr2[i].length;
                }
                for (int j = 0; j < limit; j++) {
                    toplam = arr1[i][j]+ arr2[i][j];
                    System.out.println(i + "index ile" + j + "index " + "toplami = " + toplam);
                }
            }


          }













    }
}
