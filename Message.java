import java.util.Date;

public class Message {
    private String userMessage;
    private String botResponse;
    private Date timestamp;

    // Constructor
    public Message(String userMessage, String botResponse) {
        this.userMessage = userMessage;
        this.botResponse = botResponse;
        this.timestamp = new Date();
    }

    // Getters and Setters
    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getBotResponse() {
        return botResponse;
    }

    public void setBotResponse(String botResponse) {
        this.botResponse = botResponse;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
