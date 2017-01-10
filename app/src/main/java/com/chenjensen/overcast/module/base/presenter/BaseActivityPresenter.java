package com.chenjensen.overcast.module.base.presenter;

import com.chenjensen.overcast.module.base.activity.BaseActivity;

/**
 * Created by chenjensen on 17/1/10.
 */

public abstract class BaseActivityPresenter<T extends BaseActivity> extends BasePresenter<T> {

    public BaseActivityPresenter(T target) {
        super(target);
    }
}
