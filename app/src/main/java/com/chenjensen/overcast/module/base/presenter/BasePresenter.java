package com.chenjensen.overcast.module.base.presenter;

/**
 * Created by chenjensen on 17/1/10.
 */

public abstract class BasePresenter<T> {

    protected T target;

    public BasePresenter(T target) {
        this.target = target;
    }

    public void onCreate() {

    }

    public void onStart() {

    }

    public void onResume() {

    }

    public void onStop() {

    }

    public void onPause() {

    }

    public void onDestory() {

    }
}


