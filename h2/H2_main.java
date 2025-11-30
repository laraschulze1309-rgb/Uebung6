package h2;

public class H2_main {
    
    public static boolean compareArrays (int[] arr1, int[] arr2) {


    if (arr1.length != arr2.length) return false;

    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) return false;
    }

    return true;
}


//Meine eigenen Testfälle
   public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
                       


      
        System.out.println(compareArrays(a, a));
        System.out.println(compareArrays(c, c));
        System.out.println(compareArrays(b, b));

        System.out.println(compareArrays(a, b)); 
        System.out.println(compareArrays(a, c));
        System.out.println(compareArrays(b, c)); 
  
    }
}