import java.util.Scanner;

/**
 * Salary18
 */
public class Salary18 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String namaKaryawan;
        int numAttandance, numAbsence, totalSalary;
        int salary=40000, salaryDeduction=25000;
        System.out.println("nama Karyawan: ");
        namaKaryawan = input.nextLine();
        System.out.println("Input attandance number: ");
        numAttandance = input.nextInt();
        System.out.println("Input absence number: ");
        numAbsence = input.nextInt();
        totalSalary=(numAttandance*salary)-(numAbsence*salaryDeduction);
        System.out.println("Total salary: " + totalSalary);

    }
}