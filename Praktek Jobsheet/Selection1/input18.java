import java.util.Scanner;

/**
 * input18
 */
public class input18 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("input a number");
        int number = input05.nextInt();
/**
        if (number %2 == 0) {
            System.out.println(number+"is an even number!");
        
        }else{
            System.out.println(number+"is an odd number!");
    } */

    String massage = (number %2 == 0) ? "is an odd number !" : "is an even number !";
    System.out.println(number + massage);
}
}