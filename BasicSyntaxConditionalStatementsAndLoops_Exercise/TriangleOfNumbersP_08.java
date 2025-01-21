package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class TriangleOfNumbersP_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
            number++;
        }

    }
}
