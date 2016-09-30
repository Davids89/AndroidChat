package luque.david.androidchat.chat;

/**
 * Created by david on 30/9/16.
 */

public interface ChatRepository {
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
    void changeConnectionStatus(boolean online);
}
