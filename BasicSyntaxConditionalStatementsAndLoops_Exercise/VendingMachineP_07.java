package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class VendingMachineP_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceNuts = 2.0;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1.0;

        double cash = 0;

        String input = scanner.nextLine();

        while (!input.equals("Start")) {

            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                cash += coins;
            } else {
                System.out.println("Cannot accept " + coins);
            }

            input = scanner.nextLine();
        }
        String produkt = scanner.nextLine();
        while (!produkt.equals("End")) {
            switch (produkt) {

                case "Nuts":
                    if (cash >= priceNuts) {
                        cash -= priceNuts;
                        System.out.println("Purchased " + produkt);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Water":
                    if (cash >= priceWater) {
                        cash -= priceWater;
                        System.out.println("Purchased " + produkt);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Crisps":
                    if (cash >= priceCrisps) {
                        cash -= priceCrisps;
                        System.out.println("Purchased " + produkt);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Soda":
                    if (cash >= priceSoda) {
                        cash -= priceSoda;
                        System.out.println("Purchased " + produkt);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Coke":
                    if (cash >= priceCoke) {
                        cash -= priceCoke;
                        System.out.println("Purchased " + produkt);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            produkt = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", cash);


    }
}