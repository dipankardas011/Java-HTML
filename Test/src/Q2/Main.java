package Q2;

import Q2.part1.NonTeachingPersonnel;
import Q2.part1.TeachingPersonnel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for teaching Personnel\n2 for Non Teaching Personnel\n-----");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                TeachingPersonnel o = new TeachingPersonnel("emp1", "Desiginatio01", "32423423", 342);
                o.getMarks();
            }
            case 2 -> {
                NonTeachingPersonnel o = new NonTeachingPersonnel("emp2", "Desiginatio02", "32423423", 3423);
                o.getMarks();
            }
        }
    }
}
