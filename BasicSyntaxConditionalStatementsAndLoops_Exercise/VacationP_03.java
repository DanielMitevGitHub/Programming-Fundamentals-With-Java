package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class VacationP_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;
        switch (day) {

            case "Friday":

                switch (groupType) {

                    case "Students":
                        price = 8.45;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Business":
                        price = 10.90;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Regular":
                        price = 15;
                        totalPrice = numberOfPeople * price;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType) {

                    case "Students":
                        price = 9.80;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Business":
                        price = 15.60;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Regular":
                        price = 20;
                        totalPrice = numberOfPeople * price;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType) {

                    case "Students":
                        price = 10.46;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Business":
                        price = 16;
                        totalPrice = numberOfPeople * price;
                        break;
                    case "Regular":
                        price = 22.50;
                        totalPrice = numberOfPeople * price;
                        break;
                }
                break;
        }

        if (numberOfPeople >= 30 && groupType.equals("Students")) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if
        (numberOfPeople >= 100 && groupType.equals("Business")) {
            totalPrice = totalPrice - (price * 10);
        } else if (numberOfPeople >= 10 && numberOfPeople <= 20 && groupType.equals("Regular")) {
            totalPrice -= totalPrice * 0.05;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}