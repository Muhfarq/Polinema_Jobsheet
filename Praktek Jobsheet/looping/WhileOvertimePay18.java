import java.util.Scanner;

/**
 * WhileOvertimePay18
 */
public class WhileOvertimePay18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployee, overtimePay, overTimeHours; 
        double totalOvertimePay = 0; // Initialize totalOvertimePay
        String position;

        System.out.print("Enter the number of employees: ");
        numEmployee = input.nextInt();

        int i = 0;

        while (i < numEmployee) {
            System.out.print("Enter the position of employee " + (i + 1) + " (Director, Manager, Staff): ");
            position = input.next();
            System.out.print("Enter overtime hours for employee " + (i + 1) + ": ");
            overTimeHours = input.nextInt();
            i++;
            
            if (position.equalsIgnoreCase("director")) {
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overTimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overTimeHours * 75000;
            } else {
                System.out.println("Invalid position. Please enter Director, Manager, or Staff.");
                continue;
            }

            totalOvertimePay += overtimePay;
            System.out.println("Total overtime pay for employee " + i + ": " + totalOvertimePay);
        }
    }
}
