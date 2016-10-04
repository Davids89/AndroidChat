package luque.david.androidchat.chat;

import luque.david.androidchat.entities.ChatMessage;

/**
 * Created by david on 30/9/16.
 */
public class ChatEvent {
    ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
