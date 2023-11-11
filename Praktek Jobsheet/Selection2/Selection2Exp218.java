import java.util.Scanner;

/**
 * Selection2Exp218
 */
public class Selection2Exp218 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angle1, angle2, angle3, totalAngle;
        System.out.println("Input angle 1: ");
        angle1 = input.nextInt();
        System.out.println("Input angle 2: ");
        angle2 = input.nextInt();
        System.out.println("Input angle 3: ");
        angle3 = input.nextInt();

        totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Segitiga Siku-siku");
            } else if (angle1 != 45 && angle2 != 45 && angle3 != 45) {
                System.out.println("is equalateral triangle");
            } else if (angle1 != 90 && angle2 != 90 || angle3 <= 90) {
                System.out.println("is equalateral triangle");
                
            } else {
                System.out.println("not a triangle");
            }
        } else {
            System.out.println("Sudut-sudut yang dimasukkan tidak membentuk segitiga. Total sudut harus 180 derajat.");
        }

        input.close();//menutup scanner
    }
}
