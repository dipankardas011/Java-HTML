public class Q2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(b / (float)a);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        } catch (ArithmeticException e) { //placing it here will cause compile time error
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
