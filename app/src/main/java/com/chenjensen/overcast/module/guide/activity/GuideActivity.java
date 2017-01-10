package com.chenjensen.overcast.module.guide.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

import com.chenjensen.overcast.R;
import com.chenjensen.overcast.module.base.activity.BaseBlankActivity;
import com.chenjensen.overcast.module.guide.presenter.GuidePresenter;
import com.chenjensen.overcast.module.guide.view.GuideCustomVideoView;

/**
 * Created by chenjensen on 17/1/10.
 */

public class GuideActivity extends BaseBlankActivity<GuidePresenter> {

    private GuideCustomVideoView mVideoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRealContent(R.layout.activity_guide);
        initContentView();
    }

    @Override
    protected void initPresenter() {
        presenter = new GuidePresenter(this);
    }

    @Override
    protected void initContentView() {
        mVideoView = (GuideCustomVideoView) findViewById(R.id.vv_guide_activity_guide);
    }

    public VideoView VideoView() {
        return mVideoView;
    }
}
