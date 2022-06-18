public class sorted {
    static boolean isSorted(int[] arr, int index) {
        if (index + 1 > arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;

        }
        index++;
        return isSorted(arr, index);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 4 };
        int index = 0;
        System.out.println(isSorted(arr, index));

    }

}
