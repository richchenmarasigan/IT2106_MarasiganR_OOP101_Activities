import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        // Fixed syntax: Added assignment operator '='
        Scanner input = new Scanner(System.in);

        int quantity = 0;
        int itemNum = 0;
        double price = 0;
        // Fixed syntax: Variable names cannot contain spaces
        double totalBeforeDiscount = 0;
        double totalDeduction = 0.0;
        double finalTotal = 0.0;

        char student;
        System.out.print("Are you a student? (Y/N): ");
        student = input.next().charAt(0);

        System.out.println("==== MENU ====");
        System.out.println("1. Fries      -$80.00");
        System.out.println("2. Donut       -$120.00");
        System.out.println("3. Coffee       -$160.00");
        System.out.println("4. Sandwich    -$70.00");
        System.out.println("5. Coke       -$25.00");
        
        System.out.print("Enter item number: ");
        // Fixed syntax: Added assignment operator '='
        itemNum = input.nextInt();

        System.out.print("Enter quantity: ");
        // Fixed syntax: Removed 'int' keyword since quantity was already declared above
        quantity = input.nextInt();

        // Completed the switch statement with correct prices
        switch (itemNum) {
            case 1:
                price = 80.00;
                break;
            case 2:
                price = 120.00;
                break;
            case 3:
                price = 160.00; // Fixed from 0.00
                break;
            case 4:
                price = 70.00;
                break;
            case 5:
                price = 25.00;
                break;
            default:
                System.out.println("Invalid item number selected.");
                return; // Exits the program if an invalid item is picked
        }

        // Calculate math equations
        totalBeforeDiscount = price * quantity;

        // Completed the 'if' condition to apply a 10% discount for students
        if (student == 'Y' || student == 'y') {
            totalDeduction = totalBeforeDiscount * 0.10; // 10% discount
        }

        finalTotal = totalBeforeDiscount - totalDeduction;

        // Print Receipt
        System.out.println("\n==== RECEIPT ====");
        System.out.printf("Total Before Discount: $%.2f\n", totalBeforeDiscount);
        System.out.printf("Discount Applied:      -$%.2f\n", totalDeduction);
        System.out.printf("Final Total:           $%.2f\n", finalTotal);
    }
}
