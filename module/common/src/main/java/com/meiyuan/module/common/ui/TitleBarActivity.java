package com.meiyuan.module.common.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meiyuan.module.common.R;
import com.meiyuan.module.common.widget.TitleBar;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class TitleBarActivity extends BaseActivity {

    private TitleBar titleBar;
    private ViewGroup contentView;

    protected int getTitleBarLayoutId() {
        return -1;
    }

    protected TitleBar getTitleBar() {
        return titleBar;
    }

    @Override
    public void setContentView(View view) {
        setContentViewAndInit();
        contentView.addView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        setContentViewAndInit();
        contentView.addView(view, params);
    }

    @Override
    public void setContentView(int layoutResID) {
        setContentViewAndInit();
        LayoutInflater.from(this).inflate(layoutResID, contentView, true);
    }

    private void setContentViewAndInit() {
        super.setContentView(R.layout.acitity_titlebar);
        titleBar = findViewById(R.id.titleBar);
        titleBar.init(getTitleBarLayoutId());
        titleBar.setLeftImageClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        contentView = findViewById(R.id.contentView);
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        titleBar.setTitle(title);
    }

}
