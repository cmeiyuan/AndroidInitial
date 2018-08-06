package androidinitial.cmeiyuan.com.androidinitial.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.meiyuan.module.common.ui.TitleBarActivity;

import java.util.List;

import androidinitial.cmeiyuan.com.androidinitial.R;
import androidinitial.cmeiyuan.com.androidinitial.dataobject.Module;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class MainTabsActivity extends TitleBarActivity implements TabHost.OnTabChangeListener {


    @BindView(android.R.id.tabhost)
    FragmentTabHost tabHost;
    private Fragment currentFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintabs);
        ButterKnife.bind(this);
        initTabs();
    }

    private void initTabs() {
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        List<Module> modules = Module.get();
        for (Module module : modules) {
            TabHost.TabSpec tabSpec = tabHost.newTabSpec(module.getTag());
            View view = LayoutInflater.from(this).inflate(R.layout.tabwidget_item, null);
            ImageView tabWidgetIcon = view.findViewById(R.id.tab_widget_icon);
            TextView tabWidgetText = view.findViewById(R.id.tab_widget_text);
            tabWidgetIcon.setBackgroundResource(module.getIcon());
            tabWidgetText.setText(module.getName());
            tabSpec.setIndicator(view);
            tabHost.addTab(tabSpec, module.getCls(), null);
        }
        tabHost.getTabWidget().setDividerDrawable(null);
        tabHost.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String tabId) {
//        if (currentFragment != null) {
//            currentFragment.setUserVisibleHint(false);
//        }
//        String tag = tabHost.getCurrentTabTag();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        currentFragment = fragmentManager.findFragmentByTag(tag);
//        currentFragment.setUserVisibleHint(true);
    }
}
