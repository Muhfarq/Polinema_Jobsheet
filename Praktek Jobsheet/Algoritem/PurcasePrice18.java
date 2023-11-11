import java.util.Scanner;

/**
 * PurcasePrice18
 */
public class PurcasePrice18 {

    public static void main(String[] args) {
        //preparation
        Scanner input =new Scanner(System.in);
        String bookBrand;
        String pageCount;
        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;
        //input
        System.out.print("Input Book brand: ");
        bookBrand=input.nextLine();
        System.out.print("Input Page Count: ");
        pageCount=input.nextLine();
        System.out.print("Input price: ");
        price=input.nextInt();
        System.out.print("input quantity: ");
        //process
        quantity=input.nextInt();
        totalPrice=price*quantity;
        totalDiscount=totalPrice*quantity;
        purchasePrice=totalPrice-totalDiscount;
        //output
        System.out.println("total discount: "+ totalDiscount);
        System.out.println("Final purchase price: "+ purchasePrice);
        
    }
}