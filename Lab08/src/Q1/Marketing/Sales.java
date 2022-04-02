package Q1.Marketing;

import java.util.Scanner;

public class Sales extends Q1.General.Employee {

    public Sales(int empId, String eName, float baseEarnings) {
        super(empId, eName, baseEarnings);
    }

    public float travAllowance(){
        return 0.05f * super.earnings();
    }

    public void getInfo() {
        System.out.println("EmpID: " + super.empId);
        System.out.println("eName: "+super.geteName());
        System.out.println("BaseEarning: $" + super.baseEarnings);
        System.out.println("TotalEarning: $" + super.earnings());
        System.out.println("Sales Earning: $" + travAllowance());
    }

    public static void main(String[] args) {
        System.out.println("Enter empID,empName, base salary");
        Scanner inp = new Scanner(System.in);
        int id = inp.nextInt();
        inp.nextLine(); // This line you have to add (It consumes the \n character)
        String nn = inp.nextLine();
        float base = inp.nextFloat();
        Sales sal = new Sales(id, nn, base);
        inp.close();
        sal.getInfo();
    }
}
