import java.util.Scanner;
/**
 * squareStars18
 */
public class squareStars18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of N : ");
        int N = sc.nextInt();
        // for (int i = 0; i < N; i++) {
        //     // print '*' to side
        //     System.out.print("");
            
        //     // To print '*' 5 times below
        //     for (int j = 0; j < N; j++) {
        //         System.out.print("*");
        //     }
            
        //     // To add line after one iterarion
        //     System.out.println("");
        // }

        for (int i = 1; i <= N; i++) {
            System.out.print("");
        }
        for(int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <= N; i++) {
                System.out.print(" * ");
            }
                System.out.println(""); 
        }
                   
    }
}