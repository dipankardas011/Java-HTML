package Part1;

public class PalindromeNumber {

    private boolean isPalin(int n) {
        String str = Integer.toString(n);

        int l = 0;
        int r = str.length()-1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalin(12));
        System.out.println(obj.isPalin(121));
    }
}
