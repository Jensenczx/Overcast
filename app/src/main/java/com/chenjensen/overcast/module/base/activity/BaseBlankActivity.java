package com.chenjensen.overcast.module.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.chenjensen.overcast.R;
import com.chenjensen.overcast.common.view.slidefinishlayout.SlideFinishLayout;
import com.chenjensen.overcast.module.base.presenter.BasePresenter;

/**
 * Created by chenjensen on 17/1/10.
 */

public abstract class BaseBlankActivity<T extends BasePresenter> extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_base_blank);
        initBaseView();
    }

    @Override
    protected void initBaseView() {
        rootView = (ViewGroup) findViewById(R.id.root_view);
        contentView = (SlideFinishLayout) findViewById(R.id.content_view);
    }
}
