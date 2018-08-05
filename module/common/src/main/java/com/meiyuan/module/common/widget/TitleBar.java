package com.meiyuan.module.common.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.meiyuan.module.common.R;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class TitleBar extends FrameLayout {

    private static int titleBarLayoutId = -1;

    public static void setTitleBarLayoutId(int layoutId) {
        titleBarLayoutId = layoutId;
    }

    public static int getTitleBarLayoutId() {
        return titleBarLayoutId;
    }

    private TextView title;
    private ImageView leftImage;
    private ImageView rightImage;

    public TitleBar(@NonNull Context context) {
        super(context);
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TitleBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(int layoutId) {
        if (layoutId == -1) {
            layoutId = getTitleBarLayoutId();
        }

        if (layoutId == -1) {
            throw new RuntimeException("you must set titleBarLayoutId.");
        }

        LayoutInflater.from(getContext()).inflate(layoutId, this, true);
        title = findViewById(R.id.title_bar_title);
        leftImage = findViewById(R.id.title_bar_left_image);
        rightImage = findViewById(R.id.title_bar_right_image);
    }

    public void setTitle(int textId) {
        title.setText(textId);
    }

    public void setTitle(CharSequence text) {
        title.setText(text);
    }

    public void setLeftImage(int resId) {
        leftImage.setImageResource(resId);
    }

    public void setRightImage(int resId) {
        rightImage.setImageResource(resId);
    }

    public void setLeftImageClickListener(View.OnClickListener listener) {
        leftImage.setOnClickListener(listener);
    }

    public void setRightImageClickListener(View.OnClickListener listener) {
        rightImage.setOnClickListener(listener);
    }

}
