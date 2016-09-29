package luque.david.androidchat.addcontact.ui;

/**
 * Created by david on 27/9/16.
 */

public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
