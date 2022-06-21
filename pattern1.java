
/*  *
        **
        ***
        ****
     */
public class pattern1 {
    static void p(int n, int i, int count) {
        if (i > n) {
            return;
        }
        if (count == i) {
            System.out.println();
            i = i + 1;
            p(n, i, 0);
            return;
        }
        System.out.print("*");
        count++;
        p(n, i, count);
        return;
    }

    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        p(5, i, count);
    }

}
