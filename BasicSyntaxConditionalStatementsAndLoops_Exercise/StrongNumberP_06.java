package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class StrongNumberP_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int originalNumber = number;
        int sumFactorials = 0;

        while (number > 0){

            int digit = number % 10;
            int factorials = 1;

            for (int i = 1; i <= digit ; i++) {
                factorials *= i;
            }

            sumFactorials += factorials;
            number /= 10;
        }
        if (sumFactorials == originalNumber){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


    }
}
