package Part2;

public class Pat01 {
    public static void main(String[] args) {

        char ch='A';

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++, ch++)
                System.out.print(ch);
            ch++;
            System.out.println();
        }
    }
}
