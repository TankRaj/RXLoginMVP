package com.tanka.accessories.rxlogin.view;

import android.support.v4.app.Fragment;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by access-tanka on 3/20/18.
 *
 *
 */
public abstract class BaseFragment extends Fragment {

    // region Member Variables
    protected CompositeSubscription compositeSubscription = new CompositeSubscription();
    // endregion

    // region Lifecycle Methods
    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeSubscription.unsubscribe();
    }
    // region
}
