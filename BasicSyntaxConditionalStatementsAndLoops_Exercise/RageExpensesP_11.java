package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class RageExpensesP_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetprice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsets = 0;
        int trashedMouses = 0;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                trashedHeadsets++;
            }
            if (i % 3 == 0) {
                trashedMouses++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboards++;

                if (trashedKeyboards % 2 == 0) {
                    trashedDisplays++;
                }
            }
        }

        double totalExpenses = (headsetprice * trashedHeadsets) +
                (mousePrice * trashedMouses) +
                (keyboardPrice * trashedKeyboards) +
                (displayPrice * trashedDisplays);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
