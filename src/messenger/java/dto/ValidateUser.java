package dto;

//todo Реализовать валидацию

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {

    private String login;
    private String password;

    public ValidateUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public  boolean checkUser(File users) throws FileNotFoundException {
        Scanner scanner =  new Scanner(new FileReader(users));
        Pattern pattern1 =  Pattern.compile(".+login='"+this.login+"'.+password='"+this.password+"'}$");
        while (scanner.hasNextLine()) {
            String user = scanner.nextLine();
            Matcher matcher = pattern1.matcher(user);
            if (matcher.matches()) return true;
        }
        return false;
    }
}