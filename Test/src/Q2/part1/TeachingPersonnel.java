package Q2.part1;

import Q2.part2.Student;

import java.util.Scanner;

public class TeachingPersonnel extends Employee {

    public TeachingPersonnel(String name, String designation, String contactDetails, int empCode) {
        super(name, designation, contactDetails, empCode);
    }

    @Override
    public void getMarks() {
        Scanner in = new Scanner(System.in);
        Student stu = new Student((int)(Math.random()*1000), "Dipankar", "Addr");
        System.out.println("Enter the marks");
        int sum = 0;
        for (int i = 0;i < 5; i++) {
            int x = in.nextInt();
            sum += x;
        }
        sum = sum / 5;
        System.out.println("Debug: Percentage comming -> "+sum);


        if (sum > 95)
            stu.displayGrade('O');
        else if (sum > 85)
            stu.displayGrade('E');
        else if (sum > 75)
            stu.displayGrade('A');
        else if (sum > 65)
            stu.displayGrade('B');
        else if (sum > 55)
            stu.displayGrade('C');
        else if (sum > 45)
            stu.displayGrade('P');
        else
            stu.displayGrade('F');
    }

//    public static void main(String[] args) {
//        TeachingPersonnel o = new TeachingPersonnel("emp1", "Desiginatio01", "32423423", 342);
//        o.getMarks();
//    }
}
