package luque.david.androidchat.addcontact;

import luque.david.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by david on 27/9/16.
 */

public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
