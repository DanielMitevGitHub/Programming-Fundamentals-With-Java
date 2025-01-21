package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class OrdersP_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        for (int i = 1; i <= numberOfOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = (day * capsulesCount) * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
            totalPrice += orderPrice;
        }
        System.out.printf("Total: $%.2f%n",totalPrice);

    }
}
