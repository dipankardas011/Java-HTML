package Q2.part2;

public class Student{
    public int rollNo;
    public String name;
    public String contactDetails;

    public Student(int rollNo, String name, String contactDetails) {
        this.rollNo = rollNo;
        this.name = name;
        this.contactDetails = contactDetails;
    }
    public void displayGrade(char ch) {
        switch (ch) {
            case 'O' -> System.out.println("Percentage: "+95);
            case 'E' -> System.out.println("Percentage: "+85);
            case 'A' -> System.out.println("Percentage: "+75);
            case 'B' -> System.out.println("Percentage: "+65);
            case 'C' -> System.out.println("Percentage: "+55);
            case 'P' -> System.out.println("Percentage: "+45);
            default -> System.out.println("Percentage : Failed");
        }
    }
}
