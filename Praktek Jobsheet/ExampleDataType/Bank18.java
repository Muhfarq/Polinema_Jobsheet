import java.util.Scanner;
/**
 * Bank18
 */
public class Bank18 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int init_sav_amount, sav_period;
    double final_sav_amount, interest, interest_precennt = 0.02;
    System.out.print("input your initial saving amount: ");
    init_sav_amount = sc.nextInt();
    System.out.print("input your saving periond: ");
    sav_period = sc.nextInt();
    interest = sav_period * interest_precennt * init_sav_amount;
    final_sav_amount = interest + init_sav_amount;
    System.out.println("interest: " + interest);
    System.out.println("Final saving amount: " + final_sav_amount);
    }
}