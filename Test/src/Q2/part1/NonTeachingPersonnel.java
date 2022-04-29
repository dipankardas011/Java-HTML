package Q2.part1;

public class NonTeachingPersonnel extends Employee{

    public NonTeachingPersonnel(String name, String designation, String contactDetails, int empCode) {
        super(name, designation, contactDetails, empCode);
    }

    @Override
    public void getMarks() {
        System.out.println("Non Teaching Personnel is not authorised");
    }
}
