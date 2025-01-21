package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class LoginP_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String password = "";

        for (int i = userName.length() - 1; i >= 0  ; i--) {
            password += userName.charAt(i);
        }

        int attempts = 0;
        while (true){

            String currentPassword = scanner.nextLine();
            attempts++;

            if (currentPassword.equals(password)){
                System.out.printf("User %s logged in.%n", userName);
                break;
            } else if (attempts >= 4) {
                System.out.println("User " + userName + " blocked!");
                break;
            }
            else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
