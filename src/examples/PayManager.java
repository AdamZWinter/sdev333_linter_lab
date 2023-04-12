package examples;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Javadoc
 * @author Adam Winter, Alex Brenna
 * @version see version control
 */
public class PayManager
{
    public static final int HOUR_PAD = 12;

    /**
     * Java dock
     * @param args String[] not used
     */
    public static void main(String[] args)
    {
        //run a second test
        try (Scanner console = new Scanner(System.in))
        {
            for(int i = 0; i < 3; i++){
                payroll(console);
            }
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Input mismatch!" + ex);
        }
        catch (Exception ex)
        {
            System.out.println("Error!");
        }
    }

    private static void payroll(Scanner console){
        //enter a name
        System.out.print("Enter a name: ");
        String name = console.nextLine();

        //get a pay rate and print the pay
        System.out.print("Enter a payrate: ");
        double payRate = console.nextDouble();
        console.nextLine();

        //enter an amount of hours
        System.out.print("Enter # of hours: ");
        int hours = console.nextInt();
        console.nextLine();

        //pad hours by 12
        hours += HOUR_PAD;

        PayCalculator calculator = new PayCalculator(payRate, name);
        double pay = calculator.calculatePay(false, hours);

        System.out.println("Pay: $" + pay);
        System.out.println();
    }
}