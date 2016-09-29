package luque.david.androidchat.entities;

import java.util.Map;

/**
 * Created by David on 19/9/16.
 */
public class User {
    String email;
    boolean online;
    Map<String, Boolean> contacts;
    public final static boolean ONLINE = true;

    public Map<String, Boolean> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Boolean> contacts) {
        this.contacts = contacts;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public final static boolean OFFLINE = false;

    public User() {

    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;

        if(obj instanceof User){
            User recipe = (User)obj;
            equal = this.email.equals(recipe.getEmail());
        }

        return equal;
    }
}
