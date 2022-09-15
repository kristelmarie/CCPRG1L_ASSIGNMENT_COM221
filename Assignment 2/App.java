import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
      
      revealMyOrder();

       
      scan.close();
    }
  
  static String revealMyCrush() {
        System.out.println("This will reveal your name");
        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("This will reveal the name of your crush");
        System.out.print("Enter the name of your crush: ");

        String crush = scan.nextLine();

        System.out.println("This will reveal the name of your crush");
        System.out.print("Enter the name of your crush: ");

        String MyCrush = scan.nextLine();

        return name + " loves " + crush + " and " + MyCrush;
    }

    static void revealMyOrder() {
        System.out.println("This will reveal your order");

        System.out.print("Enter your first order: ");
        String order = scan.nextLine();

        System.out.print("Enter the price of order: " );
        double x = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your second order: ");
        String order1 = scan.nextLine();

        System.out.print("Enter the price of order: ");
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your third order: ");
        String order2 = scan.nextLine();

        System.out.print("Enter the price of order: ");
        double z = scan.nextDouble();
  
        double total = x + y + z;

        System.out.println("My orders are " + order + ", " + order1 + " and " + order2);
        System.out.println("Your total is " + total);
    }
