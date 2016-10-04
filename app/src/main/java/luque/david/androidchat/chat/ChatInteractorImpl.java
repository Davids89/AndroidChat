package luque.david.androidchat.chat;

/**
 * Created by david on 4/10/16.
 */
public class ChatInteractorImpl implements ChatInteractor {

    ChatRepository repository;

    public ChatInteractorImpl() {
        this.repository = new ChatRepositoryImpl();
    }

    @Override
    public void sendMessage(String msg) {
        repository.sendMessage(msg);
    }

    @Override
    public void setRecipient(String recipient) {
        repository.setRecipient(recipient);
    }

    @Override
    public void subscribe() {
        repository.subscribe();
    }

    @Override
    public void unsubscribe() {
        repository.unsubscribe();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }
}
