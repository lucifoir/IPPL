import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conversation {
    private String userId;
    private List<Message> conversation;
    private Date startedAt;
    private Date endedAt;

    // Constructor
    public Conversation(String userId) {
        this.userId = userId;
        this.conversation = new ArrayList<>();
        this.startedAt = new Date();
    }

    // Method to add a message to the conversation
    public void addMessage(String userMessage, String botResponse) {
        this.conversation.add(new Message(userMessage, botResponse));
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Message> getConversation() {
        return conversation;
    }

    public void setConversation(List<Message> conversation) {
        this.conversation = conversation;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }
}
