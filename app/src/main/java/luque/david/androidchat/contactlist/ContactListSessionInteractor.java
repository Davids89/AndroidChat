package luque.david.androidchat.contactlist;

/**
 * Created by david on 22/9/16.
 */

public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
