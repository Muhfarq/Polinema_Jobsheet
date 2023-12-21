import java.util.Scanner;
/**
 * NestedLoop18
 */
public class NestedLoop18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temp = new double[5][7];
        /*for (int i = 0; i < temp.length; i++) {
            System.out.println("City: "+ i);
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print("day "+ (j+1)+ ": ");
                temp[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]+" ");
                
            }
            System.out.println();
        }*/
        //input temperature
        for (int i = 0; i < temp.length; i++) {
            System.out.print("city"+i);
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print("day"+(j+i)+ ": ");
                temp[i][j] = scanner.nextDouble();
            }
        }
        //display temperature
        System.out.println("temperature and average");
        for (int i = 0; i < temp.length; i++) {
            double sum = 0;
            for (double temperature : temp[i]) {
            System.out.print(temperature+" " );
            sum += temperature;                
            }
            double average = sum / temp[i].length;
            System.out.println("average: " + average + "\n");
        }
    }
}