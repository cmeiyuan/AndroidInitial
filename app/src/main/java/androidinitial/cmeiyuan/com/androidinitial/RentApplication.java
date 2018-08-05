package androidinitial.cmeiyuan.com.androidinitial;

import android.app.Application;

import com.meiyuan.module.common.widget.TitleBar;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class RentApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TitleBar.setTitleBarLayoutId(R.layout.titlebar);
    }
}
