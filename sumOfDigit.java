public class sumOfDigit {
    static int Sum(int num, int sum) {
        if (num == 0) {
            return sum;
        }

        int p = num % 10;

        sum = sum + p;
        num /= 10;
        return Sum(num, sum);

    }

    public static void main(String[] args) {
        int n = 123;
        int sum = 0;

        System.out.println(Sum(n, sum));
    }

}
