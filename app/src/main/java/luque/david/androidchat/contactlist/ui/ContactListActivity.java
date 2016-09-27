package luque.david.androidchat.contactlist.ui;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import luque.david.androidchat.R;
import luque.david.androidchat.contactlist.ContactListPresenter;
import luque.david.androidchat.contactlist.ui.adapters.ContactListAdapter;
import luque.david.androidchat.contactlist.ui.adapters.OnItemClickListener;
import luque.david.androidchat.entities.User;
import luque.david.androidchat.lib.GlideImageLoader;
import luque.david.androidchat.lib.ImageLoader;

public class ContactListActivity extends AppCompatActivity implements ContactListView, OnItemClickListener{

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.recyclerViewContacts)
    RecyclerView recyclerViewContacts;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    private ContactListAdapter adapter;
    private ContactListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        ButterKnife.bind(this);

        setupAdapter();
        setupRecyclerView();
        //presenter.onCreate();
        setupToolbar();
    }

    private void setupRecyclerView() {
        recyclerViewContacts.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewContacts.setAdapter(adapter);
    }

    private void setupAdapter() {
        ImageLoader loader = new GlideImageLoader(this.getApplicationContext());
        User user = new User();
        user.setOnline(false);
        user.setEmail("daviluqui@hotmail");
        adapter = new ContactListAdapter(Arrays.asList(new User[]{user}), loader, this);
    }

    private void setupToolbar(){
        //toolbar.setTitle(presenter.getCurrentUserEmail());
        setSupportActionBar(toolbar);
    }

    /*@Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        presenter.onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        presenter.onResume();
        super.onResume();
    }*/

    @OnClick(R.id.fab)
    public void addContact(){

    }

    @Override
    public void onContact(User user) {

    }

    @Override
    public void onContactChanged(User user) {

    }

    @Override
    public void onContactRemoved(User user) {

    }

    @Override
    public void onItemClick(User user) {

    }

    @Override
    public void onItemLongClick(User user) {

    }
}
