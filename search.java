public class search {
    static boolean isPresent(int[] arr, int num, int index) {
        if (index > arr.length - 1) {
            return false;

        }
        if (arr[index] == num) {
            return true;
        }
        ++index;
        return isPresent(arr, num, index);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 5, 6 };
        System.out.println(isPresent(arr, 9, 0));
    }

}
