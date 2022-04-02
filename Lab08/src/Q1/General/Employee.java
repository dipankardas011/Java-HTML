package Q1.General;

/**
 * Define two packages as – General and Marketing.
 * In General package define a class employee with data members as empid(protected),
 * ename(private) and a public method as earnings() which calculate total earnings as
 * earnings = basic + DA (80% of basic) + HRA (15% of basic). In Marketing package
 * define a class ,sales‟ which is extending from ,employee class and has a method
 * tallowance() which calculates Travelling Allowance as 5% of total earning.
 * Write the programs to find out total earning of a sales person for the given basic
 * salary amount and print along with the emp id.
 */
public class Employee {
    protected int empId;
    private String eName;

    public Employee(int empId, String eName, float baseEarnings) {
        this.empId = empId;
        this.eName = eName;
        this.baseEarnings = baseEarnings;
    }

    public float baseEarnings;

    /**
     * it calculates the totalEarning from the given base_salary
     * @return float the totalEarning
     */
    public float earnings(){
        return baseEarnings * (1.0f + 0.8f + 0.15f);
    }
    protected String geteName() {
        return this.eName;
    }
}
