public class numberPattern1 {
    static void print(int num, int count, int i) {

        /*
         * if (i == num && count > num) {
         * return;
         * }
         */
        if (num < i) {

            return;
        }

        if (count > i) {
            i++;
            // i = num;
            count = 1;
            System.out.println();
            print(num, count, i);
            return;
        }
        System.out.print(i);

        count++;
        print(num, count, i);

    }

    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        int i = 1;
        print(5, count, i);
    }

}
