package luque.david.androidchat.contactlist.ui;

import luque.david.androidchat.entities.User;

/**
 * Created by david on 22/9/16.
 */

public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
