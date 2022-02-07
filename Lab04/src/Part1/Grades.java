package Part1;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = in.nextInt();
        System.out.print("Grade: ");
        if (marks >= 90) {
            System.out.println("O");
        } else if (marks >= 80) {
            System.out.println("E");
        } else if (marks >= 70) {
            System.out.println("A");
        } else if (marks >=50){
            System.out.println("P");
        } else {
            System.out.println("F");
        }

        in.close();
    }
}
