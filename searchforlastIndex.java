public class searchforlastIndex {
    static int isPresentat(int[] arr, int target, int index, int lastindex) {
        if (index > arr.length - 1) {
            return lastindex;

        }
        if (arr[index] == target) {
            lastindex = index;
        }
        ++index;

        return isPresentat(arr, target, index, lastindex);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 5, 6, 4 };
        int lastindex = -1;
        System.out.println(isPresentat(arr, 4, 0, lastindex));
    }

}
