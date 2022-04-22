class ErroArgs extends Exception {
  ErroArgs() {
    super("Check Argument exception");
  }
}

public class Q4 {
  public static void main(String[] args) {
    try {
      if (args.length < 4) {
        throw new ErroArgs();
      }
      int sum = 0;
      for (String ss : args) {
        int x = Integer.valueOf(ss);
        sum += x * x;
      }
      System.out.println("Sum: " + sum);

    } catch (ErroArgs e) {
      System.out.println(e);
    }
  }
}
