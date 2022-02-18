import java.util.Scanner;

public class Q3 {
    int[][] mat;
    public Q3 (int N) {
        mat = new int[N][N];
        setMat();
    }

    private void setMat() {
//        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
//                mat[i][j] = in.nextInt();
                mat[i][j] = 1;
            }
        }
//        in.close();
    }

    public void dis() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i >= j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q3 o = new Q3(5);
        o.dis();
    }
}
