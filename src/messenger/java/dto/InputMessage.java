package dto;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class InputMessage {
    public static void input(File history, User... args) throws IOException {
        Scanner chat = new Scanner(System.in);
        FileSaver fileSaver = new FileSaver(history);
        Message message = null;
        do {for (User user: args) {
            System.out.print(user.getLogin() + ":");
            message = new Message(chat.nextLine(), user, LocalDateTime.now());
            if ((message.getMessage()).equals("EXIT")){
                System.out.println("Your session ended. Good bye.");
                break;
            } else if ((message.getMessage()).equals("EDIT")){
                System.out.println("Edit message");
            }else if ((message.getMessage()).equals("DELAY")){
                System.out.println("Delay message");
            }
            fileSaver.printToFile(message.toString());
        }} while (!(message.getMessage()).equals("EXIT"));
    }
}
