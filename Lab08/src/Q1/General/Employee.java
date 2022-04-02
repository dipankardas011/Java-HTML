package Q1.General;


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
