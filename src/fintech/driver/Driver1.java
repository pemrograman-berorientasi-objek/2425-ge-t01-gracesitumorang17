package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23008 Ranty Pakpahan
 * @author 12S23048 Grace Caldera
 */
public class Driver1 {
    
    public static void main(String[] _args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String command = scanner.nextLine();
            if (command.equals("create-account")) {
                String owner = scanner.nextLine();
                String accountName = scanner.nextLine();
                Account account = new Account(owner, accountName);
                account.displayAccountInfo();
            } else {
                System.out.println("Invalid command or arguments"); 
            }
        }
    }
}



