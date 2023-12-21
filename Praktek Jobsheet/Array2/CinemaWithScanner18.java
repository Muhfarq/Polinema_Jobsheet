import java.util.Scanner;
/**
 * CinemaWithScanner18
 */
public class CinemaWithScanner18 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row, column;
    String name, next;
    String[][] audience = new String[4][2];
/* 
    while (true) {
        System.out.print("enter name ");
        name = sc.nextLine();
        System.out.print("enter row number ");
        row = sc.nextInt();
        System.out.print("enter column number ");
        column = sc.nextInt();
        sc.nextLine();

        audience[row - 1][column - 1]= name;
        System.out.print("are there any other audience to be added ? (y/n): ");
        next = sc.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
            
        }
    }*/

    //modify
    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Input audience data");
        System.out.println("2. Show audience list");
        System.out.println("3. Exit");
        System.out.print("Select menu (1/2/3): ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                System.out.print("Enter row number: ");
                row = sc.nextInt();
                System.out.print("Enter column number: ");
                column = sc.nextInt();
                sc.nextLine(); 

                if (row < 1 || row > audience.length || column < 1 || column > audience[0].length) {
                    System.out.println("Invalid seat selection. Please choose again.");
                    break;
                }

                if (audience[row - 1][column - 1] != null) {
                    System.out.println("Seat already taken by " + audience[row - 1][column - 1] + ". Please choose another seat.");
                    break;
                } else {
                    audience[row - 1][column - 1] = name;
                    System.out.println("Successfully added " + name + " to Row " + row + ", Column " + column);
                }
                break;


            case 2:
                System.out.println("Audience list:");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] != null) {
                            System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": " + audience[i][j]);
                        } else {
                            System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": ***");
                        }
                    }
                }
                break;
            

            case 3:
                System.out.println("Exit the program. Thank You!");
                System.exit(0);

            default:
                System.out.println("Invalid selection. Please choose again.");
        }

        System.out.print("Are there any other viewers to be added? (y/n):");
        next = sc.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
    }
    }
}