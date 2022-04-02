package Q2;

public class Washing implements Q2.Motor {

    class ErrorE extends Throwable {
        public String whatC() {
            return "No more capacity left";
        }
        public String whatR() {
            return "Empty Washing machine cannot RUN!!";
        }
    }

    protected int currCap;

    public Washing() {
        this.currCap = CAPACITY;
    }

    @Override
    public void run() {
        try {
            if ((CAPACITY - currCap) == 0)
                throw new ErrorE();
            System.out.println("RUNNING..... with capacity: "+(CAPACITY - currCap));
            currCap = CAPACITY;
        }catch(ErrorE e) {
            System.out.println(e.whatR());
        }
    }

    @Override
    public void consume() {
        try {
            if (currCap == 0)
                throw new ErrorE();
            System.out.println("Capacity left: " + currCap--);
        }catch(ErrorE e) {
            System.out.println(e.whatC());
        }
    }

    public static void main(String[] args) {
        Washing was = new Washing();
        was.run();
        was.consume();
        was.consume();
        was.consume();
        was.consume();
        was.consume();
        was.run();
        was.consume();
        was.consume();
        was.run();
    }
}
