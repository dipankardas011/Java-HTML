import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String x = in.nextLine();
        String lX = x.toLowerCase();
        if (lX.equals(x)) {
            System.out.println("Uppercase: "+x.toUpperCase());
        } else {
            System.out.println("Lowercase: "+lX);
        }
        StringBuilder xyz = new StringBuilder(x);
        System.out.println("Reverse: " + xyz.reverse().toString());
        
        System.out.println("Enter another String: ");
        String y = in.nextLine();

        int diff = x.compareTo(y);
        if (diff > 0) {
            System.out.println(x + " is alphabetically greater than " + y);
        } else if (diff < 0) {
            System.out.println(x + " is alphabetically less than " + y);
        } else {
            System.out.println(x + " Equal " + y);
        }
        x = x.concat(y);
        System.out.println("Inserted y -> " + x);
        in.close();
    }
}
