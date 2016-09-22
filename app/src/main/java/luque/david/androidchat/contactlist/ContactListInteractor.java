package luque.david.androidchat.contactlist;

/**
 * Created by david on 22/9/16.
 */

public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
