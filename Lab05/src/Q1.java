import java.util.Scanner;

class Shape {
    /**
     * @def area() for the square
     * @param A
     * @return
     */
    public int area(int A) {
        return A*A;
    }

    /**
     * are for the circle
     * @param radius
     * @return
     */
    public float area(float radius) {
        return (float)(Math.PI) * radius * radius;
    }

    /**
     * def are of rightangled triangle
     * @param base
     * @param height
     * @return
     */
    public float area (float base, float height) {
        return 0.5f * base * height;
    }


}

public class Q1 {
    public static void main(String[] args) {
        Shape sh = new Shape();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Enter [ 1 ] are of square");
        System.out.println("Enter [ 2 ] are of circle");
        System.out.println("Enter [ 3 ] are of triangle");
        choice = in.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the side length");
                int l = in.nextInt();
                System.out.println("Area of square: " + sh.area(l));
                break;
            case 2:
                System.out.println("Enter the radius");
                float r = in.nextFloat();
                System.out.println("Area of circle: " + sh.area(r));
                break;

            case 3:
                System.out.println("Enter the height, base for the triangle");
                float h = in.nextFloat();
                float b = in.nextFloat();
                System.out.println("Area of triangle: " + sh.area(b, h));
                break;
            default:
                System.err.println("Inv choice");
        }
    }
}
