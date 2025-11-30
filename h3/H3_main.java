package h3;

public class H3_main {
    public static boolean compareArraysVal (int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            int countA = 0;
            int countB = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) { 
                    countA++;
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (b[j] == a[i]) {
                countB++;
            }
        }
        if (countA != countB) return false;

    }          
    
    return true;

}


//meine eigenen Testfälle
public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        System.out.println(compareArraysVal(a, c));
        System.out.println(compareArraysVal(a, e));
        System.out.println(compareArraysVal(c, e));

        System.out.println(compareArraysVal(a, b)); 
        System.out.println(compareArraysVal(a, d));
        System.out.println(compareArraysVal(a, f)); 
}

}
