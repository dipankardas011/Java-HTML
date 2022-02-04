package Part2;

public class Pat02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int sp = 0; sp < 5 - i; sp++) {
                System.out.print(" ");
            }
            for (int leftside = i; leftside < 2*i; leftside++) {
                System.out.print(leftside);
            }

            for (int rightside = 2*i-2; rightside >= i; rightside--) {
                System.out.print(rightside);
            }
            System.out.println();
        }
    }
}
