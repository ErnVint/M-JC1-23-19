package java.dto;

import java.util.Date;

public class Message {

    private final User user;
    private Date date;
    private String message;

    public Message(User user, Date date, String message) {
        this.user = user;
        this.date = date;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
