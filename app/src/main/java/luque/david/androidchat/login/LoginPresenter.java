package luque.david.androidchat.login;

/**
 * Created by David on 14/9/16.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
