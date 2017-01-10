package com.chenjensen.overcast.module.guide.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by chenjensen on 17/1/10.
 */

public class GuideCustomVideoView extends VideoView {

    public GuideCustomVideoView(Context context){
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    public GuideCustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GuideCustomVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
