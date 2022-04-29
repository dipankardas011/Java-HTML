package Q1;

import java.util.Scanner;

class Blocking extends Exception {
    Blocking() {
        super("Card Blocked!");
    }
}

class Exce1 extends Exception {
    Exce1() {
        super("Incorrect Pin, some attempts are left!");
    }
}


public class ATM {
    private int correctPin;
    public boolean active;

    public ATM() {
        this.correctPin = 1234;
        this.active = true;
    }

    void enterPIN() {
        try {
            int attempts = 3;
            if (!active)
                throw new Blocking();

            Scanner in = new Scanner(System.in);

            while (attempts-- > 0) {
                System.out.println("Enter PIN-> ");
                int x = in.nextInt();

                int flag = 0;
                try {
                    if (x == correctPin) {
                        System.out.println("Correct PIN");
                        flag =1;
                    } else {
                        throw new Exce1();
                    }
                } catch (Exce1 e) {
                    System.out.println(e);
                }
                if (flag == 1)
                    return;
            }
            active = false;
        } catch (Blocking e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        ATM a = new ATM();
        a.enterPIN(); // user1
        System.out.println("-------------");
        a.enterPIN(); // user2
    }
}
