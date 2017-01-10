package com.chenjensen.overcast.module.guide.presenter;

import android.net.Uri;
import com.chenjensen.overcast.R;
import com.chenjensen.overcast.module.base.presenter.BaseActivityPresenter;
import com.chenjensen.overcast.module.guide.activity.GuideActivity;

/**
 * Created by chenjensen on 17/1/10.
 */
public class GuidePresenter extends BaseActivityPresenter<GuideActivity> {

    private String first_video_uri;

    public GuidePresenter(GuideActivity target) {
        super(target);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initVideoResource();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        playVideoView();
    }

    private void initVideoResource() {
        first_video_uri = "android.resource://" + target.getPackageName() + "/" + R.raw.splash_1;
    }

    private void playVideoView() {
        target.VideoView().setVideoURI(Uri.parse(first_video_uri));
        target.VideoView().start();
    }
}
