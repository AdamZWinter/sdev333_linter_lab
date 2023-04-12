package examples;

/**
 * This the javadoc
 * @author Adam Winter, Alex Brenna
 * @version see version control
 */
public class PayCalculator
{
    public static final int FULL_HOURS = 40;
    public static final double OVERTIME_RATE = 0.5;
    private double payAmount;
    private String employeeFullName;

    /**
     *
     * @param payAmount the payment amount
     * @param employeeFullName String the name of the employee
     */
    public PayCalculator(double payAmount, String employeeFullName)
    {
        this.payAmount = payAmount;
        this.employeeFullName = employeeFullName;
    }

    /**
     * This is the doc
     * @param salaried boolean whether salaried
     * @param hours int number of hours worked
     * @return double the pay
     */
    public double calculatePay(boolean salaried, int hours)
    {
        if (salaried)
        {
            return payAmount;
        }
        else
        {
            double total = hours * payAmount;

            if (hours > FULL_HOURS)
            {
                total += hours * (OVERTIME_RATE * payAmount);
            }

            return total;
        }
    }

//    /**
//     * Thsi is the javadoc
//     */
//    public void printEmployee()
//    {
//        System.out.println(employeeFullName);
//    }

    @Override
    public String toString() {
        return "PayCalculator{" +
                "payAmount=" + payAmount +
                ", employeeFullName='" + employeeFullName + '\'' +
                '}';
    }
}