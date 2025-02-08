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
                Account account  = new Account(
                        _args[0],
                        _args[1]);

                System.out.println(account);
            }
        }
    }
}


    

