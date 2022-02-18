import java.util.Scanner;

public class Q4 {
    int[][] mat;
    public Q4 (int M, int N) {
        mat = new int[M][N];
        setMat();
    }

    private void setMat() {
//        Scanner in = new Scanner(System.in);
        int ele = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
//                mat[i][j] = in.nextInt();
                mat[i][j] = ele++;
            }
        }
//        in.close();
    }

    public void transpose() {
        int[][] newMat = new int[mat[0].length][mat.length];
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                newMat[i][j] = mat[j][i];
            }
        }
        mat = newMat;
    }

    public void dis() {
        for (int[] row : mat) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q4 obj = new Q4(4, 3);
        obj.dis();
        System.out.println();
        obj.transpose();
        obj.dis();
    }
}
