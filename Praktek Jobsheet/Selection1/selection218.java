import java.util.Scanner;
/**
 * selection218
 */
public class selection218 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("nilai uas :");
        float finalExam = input05.nextFloat();
        System.out.print("nilai uts :");
        float midExam = input05.nextFloat();
        System.out.print("nilai kuis :");
        float quiz = input05.nextFloat();
        System.out.print("nilai tugas :");
        float assigment = input05.nextFloat();

        float total = (finalExam*0.4F) + (midExam*0.3F) + (quiz*0.1F) + (assigment*0.2F);
        String message = total <65 ? "retake" : "pass";
        System.out.println("final grade = " + total + "and the decission is " +message );
        
        if (total < 65) {
            message = "retake";
        } else {
            message = "pass";
        }

        char grade;
        if (total >= 85) {
            grade = 'A';
        } else if (total >= 75) {
            grade = 'B';
        } else if (total >= 65) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Final grade = " + grade + " and the decision is " + message);
    }
}