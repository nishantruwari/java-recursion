import java.util.Arrays;

public class CountOccurence {
    // static index=0;//global variable
    static int count(int[] arr, int index, int count) {
        if (index + 1 == arr.length) {
            return count;
        }
        if (arr[index] != arr[index + 1]) {
            return count;
        }

        count++;
        index++;
        return count(arr, index, count);
    }

    static void print(int[] arr, int Startingindex) {
        if (Startingindex == arr.length) {
            return;
        }
        int count = 1;
        int index = Startingindex;

        System.out.println(arr[Startingindex] + " >" + count(arr, index, count));
        Startingindex = Startingindex + count(arr, index, count);
        // System.out.println("====" + Startingindex);
        print(arr, Startingindex);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 4, 1, 2, 1 };
        Arrays.sort(arr);
        int Startingindex = 0;
        // int index=Startingindex;
        print(arr, Startingindex);
    }

}
