package luque.david.androidchat.contactlist.ui.adapters;

import luque.david.androidchat.entities.User;

/**
 * Created by david on 22/9/16.
 */

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
