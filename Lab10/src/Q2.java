class ErrorStack extends Exception {
  ErrorStack(String x) {
    super(x);
  }
}

class Stack {
  private final int CAP = 30;
  private int[] arr;
  private int top;

  public Stack() {
    top = -1;
    arr = new int[CAP];
  }

  public int peek() throws ErrorStack  {
    if (top == -1) {
      throw new ErrorStack("Stack EMPTY!!");
    }
    return arr[top];
  }

  public void pop() throws ErrorStack {
    if (top == -1) {
      throw new ErrorStack("Stack EMPTY!!");
    }
    arr[top] = -9999;
    top--;
  }
  
  public void push(int x) throws ErrorStack {
    if (top == CAP - 1) {
      throw new ErrorStack("Stack FULL!!");
    }
    arr[++top] = x;
  }

  public void disStackContents() {
    System.out.println("STACK");
    for (int i = top; i >= 0; i--) {
      System.out.println("| " + arr[i] + " |");
    }
    System.out.println("-------\n");
  }
}

public class Q2 {
  public static void main(String[] args) {
    Stack stk = new Stack();
    try {
      stk.push(2);
      stk.push(4);
      stk.push(8);
      stk.push(9);
      stk.push(1);
      stk.disStackContents();
      stk.pop();
      stk.pop();
      stk.pop();
      System.out.println("Peek(): "+stk.peek());
      stk.pop();
      stk.pop();
      stk.pop();
    } catch (ErrorStack e) {
      System.out.println(e);
    }
  }
}
