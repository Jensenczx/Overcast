package com.chenjensen.overcast.module.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.chenjensen.overcast.common.view.slidefinishlayout.SlideFinishLayout;
import com.chenjensen.overcast.common.view.slidefinishlayout.SlideFinishListener;
import com.chenjensen.overcast.module.base.presenter.BasePresenter;

/**
 * Created by chenjensen on 17/1/10.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity
        implements SlideFinishListener{

    protected T presenter;
    protected View rootView;
    protected SlideFinishLayout contentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        if (presenter != null) {
            presenter.onCreate();
        }
     }

    protected abstract void initPresenter();

    public void setRealContent(int resId) {
        getLayoutInflater().inflate(resId, contentView);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSlideFinish() {

    }
}
