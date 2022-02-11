import java.util.Scanner;

class Matrix {

    private int rows;
    private int cols;
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[this.rows][this.cols];
    }
    public void setMatrix(int i, int j, int ele) {
        matrix[i][j] = ele;
    }
    public void display() {
        for (int[] rows : matrix) {
            for (int e : rows)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void addition(Matrix mat2) {
        if (mat2.cols != this.cols || mat2.rows != this.rows) {
            System.err.println("Matrices cannot be added");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // by default this.matrix is getting modified
                this.matrix[i][j] += mat2.matrix[i][j];
            }
        }

        System.out.println("Done result");
        this.display();
    }

    public void multiplication(Matrix mat2) {
        if (this.cols != mat2.rows)
        {
            System.err.println("Matrices cannot be multiplied");
            return;
        }

        int[][] mul = new int[this.rows][mat2.cols];

        for (int rowMat1 = 0; rowMat1 < this.rows; rowMat1++) {
            for (int colMat2 = 0; colMat2 < mat2.cols; colMat2++) {
                for (int rowMat2 = 0; rowMat2 < mat2.rows; rowMat2++) {
                    mul[rowMat1][colMat2]
                            += this.matrix[rowMat1][rowMat2] * mat2.matrix[rowMat2][colMat2];
                }
            }
        }
        this.cols = mat2.cols;
        this.matrix = mul;


        System.out.println("Done result");
        this.display();
    }

}

public class Q2 extends Matrix{

    public Q2(int r, int c) {
        super(r, c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows & cols");
        int r = in.nextInt();
        int c = in.nextInt();
        Q2 obj = new Q2(r, c);
        System.out.println("First enter the data");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                obj.setMatrix(i,j, in.nextInt());
            }
        }

        int ch;
        Q2 mat2 = new Q2(r, c);
        System.out.println("second matrix enter the data");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2.setMatrix(i,j, in.nextInt());
            }
        }
        do {
            System.out.println("Enter [ 0 ] to EXIT");
            System.out.println("Enter [ 1 ] to number of rows");
            System.out.println("Enter [ 2 ] to number of cols");
            System.out.println("Enter [ 3 ] to set at particular");
            System.out.println("Enter [ 4 ] to display");
            System.out.println("Enter [ 5 ] add 2 matrixs");
            System.out.println("Enter [ 6 ] multiply 2 matrix");
            ch = in.nextInt();

            switch(ch) {
                case 0-> System.err.println("EXITING CODE 0x0001");
                case 1-> System.out.println(obj.getRows());
                case 2-> System.out.println(obj.getCols());
                case 3-> {
                    System.out.println("Enter the [i, j] and the element to enter");
                    int i, j, ele;
                    i = in.nextInt();
                    j = in.nextInt();
                    ele = in.nextInt();
                    obj.setMatrix(i,j,ele);
                }
                case 4 -> obj.display();

                case 5-> obj.addition(mat2);

                case 6-> obj.multiplication(mat2);

                default -> System.err.println("Inv");
            }
        }while(ch != 0);
    }
}
