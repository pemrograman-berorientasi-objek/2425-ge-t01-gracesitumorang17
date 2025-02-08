package fintech.driver;

import java.util.Scanner;
/**
 * @autor 12S23008 Ranty Insen Pakpahan
 * @autor 12S23048 Grace Caldera Situmorang
 */
public class Driver1 {

    public static void main(String[] _args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String command = scanner.nextLine();
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            
            if (command.equals("create-account")) {
                System.out.println(accountName + "|" + owner + "|" + 0.0);
            } else {
                System.out.println("Perintah tidak valid");
            }
        }
    }
}




