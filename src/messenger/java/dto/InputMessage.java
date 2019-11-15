package dto;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class InputMessage {
    static LocalDateTime publishTime = LocalDateTime.now();
    //static Message delayedMessageObj;
    static List<Message> messageList = new ArrayList<>();

    public static Scanner chat = new Scanner(System.in);

    public static void input(File history, User... args) throws IOException {

        FileSaver fileSaver = new FileSaver(history);
        Message message = null;
        do {
            for (User user : args) {
                System.out.print(user.getLogin() + ":");
                message = new Message(chat.nextLine(), user, LocalDateTime.now());
                if ((message.getMessage()).equals("EXIT")) {
                    System.out.println("Your session ended. Good bye.");
                    break;
                } else if ((message.getMessage()).equals("EDIT")) {
                    System.out.println("Edit message");

                } else if ((message.getMessage()).equals("DELAY")) {
                    System.out.println("Delay message");
                    inputDelayedMessage(user);
                }

                fileSaver.printToFile(message.toString());
                if (messageList.size() > 0) checkDelayedMessage(fileSaver);

            }
        } while (!(message.getMessage()).equals("EXIT"));
    }

    public static void inputDelayedMessage(User user) {

        int time = 0;
        do {
            System.out.print("Minutes to delay: ");
            try {
                time = Integer.parseInt(chat.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong time");
            }
        } while (time <= 0);
        publishTime = LocalDateTime.now().plusMinutes(time);
        System.out.print(user.getLogin() + "(delayed message): ");
        String m = chat.nextLine();
        Message delayedMessageObj = new Message(m, user, publishTime);
        messageList.add(delayedMessageObj);
        System.out.println("message saved");
    }

    public static void checkDelayedMessage(FileSaver fileSaver) throws IOException {
        for (Message x :
                messageList) {
            if (x.getDate().isBefore(LocalDateTime.now())) {
                System.out.println(x.getUser().getLogin() + "(delayed): " + x.getMessage());
                fileSaver.printToFile(x.toString());
            }
        }
        messageList.removeIf(x -> (x.getDate().isBefore(LocalDateTime.now())));

    }


}
