package luque.david.androidchat.contactlist.ui.adapters;

import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by david on 22/9/16.
 */
public interface ImageLoading {
    void load(ImageView imgAvatar, String url);
}
