public class countNoOfZero {
    static int count(int num, int numOfZero) {
        if (num == 0) {
            return numOfZero;
        }
        if (num % 10 == 0) {
            numOfZero++;

        }
        num /= 10;
        return count(num, numOfZero);

    }

    public static void main(String[] args) {
        // countNoOfZero c = new countNoOfZero(); // this would be done if count
        // function wont be static
        // System.out.println(c.count(num, numOfZero));

        int num = 10002903;
        int numOfZero = 0;
        System.out.println(count(num, numOfZero));

    }

}
