import java.util.Scanner;
/**
 * Selection2Exp118
 */
public class Selection2Exp118 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
         System.out.print("Input Year ");
          int year = scanner.nextInt();

        /*if (year%4==0) {
            if(year%100 != 0)
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year"); */

            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                System.out.println(year + " adalah tahun kabisat.");
            } else {
                System.out.println(year + " bukan tahun kabisat.");
            }
    
       
            
        }      
    }
