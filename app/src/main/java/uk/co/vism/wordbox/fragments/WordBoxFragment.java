package uk.co.vism.wordbox.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;

import org.androidannotations.annotations.EFragment;

import io.realm.Realm;
import uk.co.vism.wordbox.managers.UserManager;
import uk.co.vism.wordbox.models.User;

public abstract class WordBoxFragment extends Fragment {
    protected Realm realm;
    protected User user;

    public interface OnUserLoaded {
        public void onUserLoaded(User user);
    }

    public abstract void updateData();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        realm = Realm.getInstance(getActivity());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}