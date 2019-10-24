package dto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterNewUser {
    private File file;

    public RegisterNewUser(File file) {
        this.file = file;
    }


    public void newUser() throws IOException {
        String newUser = "";
        boolean checkExistingUser = true;
        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(new FileReader("/Users/ernvint/IdeaProjects/Car/src/messenger/java/Users.rtf"));
        Pattern pattern1 = Pattern.compile(".+login='" + newUser + "'.+");
        Pattern pattern2 = Pattern.compile("^[^\\d!#\\\\А-яЁё].*[^!#\\\\А-яЁё]{4,}");
        while (checkExistingUser) {
            System.out.print("     /**\n" +
                    "     * only english letters\n" +
                    "     * min 5 symbols\n" +
                    "     * not starting with number\n" +
                    "     * should not contain #,!,\\\n" +
                    "     **/ \n" +
                    "Enter USERNAME: ");
            newUser = scanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String baseUser = fileScanner.nextLine();
                Matcher matcher = pattern1.matcher(baseUser);
                Matcher matcher2 = pattern2.matcher(newUser);
                if (matcher.matches()) {
                    System.out.println("Username already exist. Choose another username.");
                    break;
                } else if (!matcher.matches() && matcher2.matches() && !fileScanner.hasNextLine()) {
                    checkExistingUser = false;
                } else if (!matcher.matches() && !matcher2.matches()) {
                    System.out.println("Check username requirements:");
                    break;
                }
            }
        }

        System.out.print("Enter password: ");
        String pw = scanner.nextLine();
        User newUser1 = new User(newUser, pw);
        FileSaver fileSaver = new FileSaver(this.file);
        fileSaver.printToFile(newUser1.toString());
        System.out.println("Registration successful.");
        Login.login(this.file);
    }
}
