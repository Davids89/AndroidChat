package luque.david.androidchat.chat.ui;

import luque.david.androidchat.entities.ChatMessage;

/**
 * Created by david on 30/9/16.
 */

public interface ChatView {
    void onMessageReceived(ChatMessage msg);
}
