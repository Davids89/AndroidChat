package luque.david.androidchat.addcontact;

/**
 * Created by david on 29/9/16.
 */
public class AddContactInteractorImpl implements AddContactInteractor {

    AddContactRepository repository;

    public AddContactInteractorImpl() {
        this.repository = new AddContactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
