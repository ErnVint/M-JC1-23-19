package dto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static User user;
    public static void login(File users) throws IOException {
        System.out.println("Type in your username and password or REGNEW and empty password to register.");
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        do {
            System.out.print("USERNAME: ");
            String login = scanner.nextLine();
            if (login.equals("REGNEW")) {
                RegisterNewUser n = new RegisterNewUser(users);
                n.newUser();
            } else {
                System.out.print("PASSWORD: ");
                String password = scanner.nextLine();
                ValidateUser validateUser = new ValidateUser(login, password);
                if (validateUser.checkUser(users)) {
                    System.out.println("Login successful.");
                    user = new User(login, password);
                    success = true;
                } else {
                    System.out.println("Please check you USERNAME and PASSWORD or type REGNEW to register.");
                }
            }
        } while (!success);

    }

}
