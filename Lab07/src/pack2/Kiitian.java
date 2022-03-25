package pack2;

import pack1.Student;

public class Kiitian extends Student{

    public String name;

    public Kiitian(int roll) {
        super.regNo = (int)(Math.random()*100000);
        super.roll = roll;
        this.name = "Demo-01";
    }

    @Override
    public void course() {
        System.out.printf("Name: %s\nThe roll: %d\t", name, roll);
        System.out.printf("The registration number: %d\n",regNo);
    }

    public static void main(String[] args) {
        Kiitian obj = new Kiitian(20051554);
        obj.course();
    }
}
/**
 * javac .\pack2\Kiitian.java
 * java pack2/Kiitian
 */
