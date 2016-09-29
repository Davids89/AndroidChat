package luque.david.androidchat.addcontact.events;

/**
 * Created by david on 27/9/16.
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
