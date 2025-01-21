package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class PadawanEquipmentP_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double  priceofRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());


        double totalPriceOfLightsabers = Math.ceil(countOfStudents * 1.10) * priceOfLightsabers;
        double totalPriceofRobes = countOfStudents * priceofRobes;
        double totalPriceOfBelts = (countOfStudents - (countOfStudents / 6)) * priceOfBelts;


        double totalPrice = totalPriceOfLightsabers + totalPriceofRobes + totalPriceOfBelts;

        if (totalPrice <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - budget);
        }


    }
}
