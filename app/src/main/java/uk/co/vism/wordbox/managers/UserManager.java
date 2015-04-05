package uk.co.vism.wordbox.managers;

import android.content.Context;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmList;
import uk.co.vism.wordbox.models.Sentence;
import uk.co.vism.wordbox.models.User;

public class UserManager {
    public static User getUserById(Realm realm, int id) {
        return realm.where(User.class).equalTo("id", id).findFirst();
    }

    public static void updateUserByJson(Context context, Realm realm, int id, String json) {
        realm.beginTransaction();

        Log.d("json", json);
        realm.createOrUpdateObjectFromJson(User.class, json);

        realm.commitTransaction();
    }
}