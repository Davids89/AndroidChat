package luque.david.androidchat.lib;

import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by david on 22/9/16.
 */
public interface ImageLoader {
    void load(ImageView imgAvatar, String url);
}
