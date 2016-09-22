package luque.david.androidchat.contactlist;

import luque.david.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by david on 22/9/16.
 */

public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
