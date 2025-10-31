package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3, min = 0, max = 0;
        if (i < j) {
            if (j < k) {
                min = i;
                max = k;
            } else if (i < k) {
                min = i;
                max = j;
            } else {
                min = k;
                max = j;
            }
        } else if (j > k) {
            max = i;
            min = k;
        } else if (k > i){
            max = k;
            min = j;
        } else {
            max = i;
            min = j;
        }
    }
}
