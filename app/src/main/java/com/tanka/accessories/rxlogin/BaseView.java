package com.tanka.accessories.rxlogin;

/**
 * Created by access-tanka on 3/20/18.
 */

public interface BaseView<T extends BasePresenter> extends ContextProvider {
    void showNetworkNotAvailableError();
}