package Q2.part1;

import Q2.Person;
import Q2.part2.Student;

import java.util.Scanner;

public abstract class Employee implements Person {

    public String name;
    public String designation;
    public String contactDetails;
    public int empCode;

    public Employee(String name, String designation, String contactDetails, int empCode) {
        this.name = name;
        this.designation = designation;
        this.contactDetails = contactDetails;
        this.empCode = empCode;
    }
}
