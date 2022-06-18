public class fibonacci {
    // 0 1 1 2 3 5 8....
    static void fibonacci(int i, int j, int n, int count) {
        if (count == n) {
            return;
        }
        int k = i + j;
        i = j;
        j = k;
        count++;
        System.out.print(k + " ");
        fibonacci(i, j, n, count);

    }

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        // int k=0;
        int n = 10;
        int count = 2;
        System.out.print(i + " " + j + " ");
        fibonacci(i, j, n, count);
    }

}
