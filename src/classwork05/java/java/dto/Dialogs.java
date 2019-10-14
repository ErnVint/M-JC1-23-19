package java.dto;

import java.util.Arrays;

public class Dialogs {
    private Message[] messages = new Message[0];

    public void addMessage(Message message){
        this.addMessages(new Message[] {message});
    }

    public void addMessages (Message[] messages){

        if (messages.length != 0 && messages != null){
            this.messages = Arrays.copyOf(this.messages, this.messages.length+messages.length);
            int messagesLength = messages.length;
            for (Message mes : messages) { this.messages[this.messages.length - messagesLength--] = mes; }

        }


    }

}
