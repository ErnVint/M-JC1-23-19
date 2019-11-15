import dto.*;
import dto.User;

import java.io.File;
import java.io.IOException;

public class Messenger {
    /**
     * Мессенджер
     * 1. Вводить ник:
     * 1.1 Должен быть только латинскими буквами
     * 1.2 Должен быть не меньше 5 символов
     * 1.3 Не должен начинаться с цифры
     * 1.4 Не должен содержать #,!,\
     * 2. Сообщения вводятся через консоль
     * 3. Сообщения хранятся в массиве
     * 4. Можно отредактировать своё сообщение если оно не старше минуты
     * 5. Можно писать отложенные сообщения
     **/


    public static void main(String[] args) throws IOException {

        File users = new File("/Users/ernvint/IdeaProjects/Car/src/messenger/java/Users.rtf");
        File history = new File ("/Users/ernvint/IdeaProjects/Car/src/messenger/java/History.rtf");

        Login.login(users);
        User user1 = Login.user;
        Login.login(users);
        User user2 = Login.user;
        Login.login(users);
        User user3 = Login.user;
        InputMessage.input(history, user1, user2, user3);
    }
}