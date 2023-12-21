import java.util.Scanner;
/**
 * ExpressingGratitude_18
 */
public class ExpressingGratitude_18 {
    public static String getGreetingRecipient(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Input name : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being best teacher\n"+
        "you inspired in me a love for learning and mad me feel i could ask you anything");
    }
    public static void main(String[] args) {
        sayThankyou();
    }
}