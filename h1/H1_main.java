package h1;

public class H1_main {

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {6, 5, 4, 3, 2, 1};

        boolean result = isMirrorArray(a, b);

        System.out.println("Spiegelbildlich:" + result);
    }
}
