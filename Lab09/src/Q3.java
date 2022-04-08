public class Q3 {
    public int a;

    public static void main(String[] args) {
        Q3 obj = null;
        try {
            System.out.println(3/0);
            if (obj.a == 5) {
                System.out.println(obj.a);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exception is handled");
        }
    }
}
