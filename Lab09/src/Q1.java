import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{234,43,45};
        try {
            System.out.println(arr[0]);
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println(Arrays.toString(arr));
        }
    }
}
