import java.util.Scanner;
/**
 * Greeteing18
 */
public class Greeteing18 {
    public static String getGreetingRecipient() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Input name : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" may the force be with you !");
    }
}
