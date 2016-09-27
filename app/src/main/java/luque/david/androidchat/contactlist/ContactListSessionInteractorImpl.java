package luque.david.androidchat.contactlist;

/**
 * Created by david on 26/9/16.
 */
public class ContactListSessionInteractorImpl implements ContactListSessionInteractor {

    ContactListRepository contactListRepository;

    public ContactListSessionInteractorImpl() {
        contactListRepository = new ContactListRepositoryImpl();
    }

    @Override
    public void signOff() {
        contactListRepository.signOff();
    }

    @Override
    public String getCurrentUserEmail() {
        return contactListRepository.getCurrentUserEmail();
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        contactListRepository.changeConnectionStatus(online);
    }
}
