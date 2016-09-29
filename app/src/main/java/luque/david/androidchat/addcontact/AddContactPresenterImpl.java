package luque.david.androidchat.addcontact;

import luque.david.androidchat.addcontact.AddContactPresenter;
import luque.david.androidchat.addcontact.events.AddContactEvent;
import luque.david.androidchat.addcontact.ui.AddContactView;

/**
 * Created by david on 29/9/16.
 */
public class AddContactPresenterImpl implements AddContactPresenter {

    private AddContactView view;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void addContact(String email) {

    }

    @Override
    public void onEventMainThread(AddContactEvent event) {

    }
}
