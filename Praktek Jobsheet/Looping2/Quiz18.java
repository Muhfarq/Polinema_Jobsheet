import java.util.Scanner;
import java.util.Random;
/**
 * Quiz18
 */
public class Quiz18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        char menu = 'y';
        do {
            int number = R.nextInt(10) + 1 ;
            boolean success =  false;
            do {
                System.out.print("Guess the number (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer < number) {
                    System.out.println("to small try again");
                    
                }
                
                success = (answer == number);
            } while (!success);
        } while (menu == 'Y' || menu == 'y');
    }
}