import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public int BinarySearch(int target, int[] arr, int left, int right) {
        if (left > right)
            return -1;

        int mid = left + (right - left)/ 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] < target)
            return BinarySearch(target, arr,  mid + 1, right);
        else
            return BinarySearch(target, arr, left, mid - 1);
    }

    public static void main(String[] args) {
        Q1 o = new Q1();
        int[] arr = new int[]{3,4,7,2,5,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target");
        int target = new Scanner(System.in).nextInt();
        System.out.println(o.BinarySearch(target, arr, 0, arr.length-1));
    }
}
