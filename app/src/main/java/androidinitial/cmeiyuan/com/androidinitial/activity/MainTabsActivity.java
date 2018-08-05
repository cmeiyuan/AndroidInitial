package androidinitial.cmeiyuan.com.androidinitial.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabHost;

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

    @BindView(R.id.fragmentTabHost)
    FragmentTabHost fragmentTabHost;

    private Fragment currentFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintabs);
        ButterKnife.bind(this);
        initTabs();
    }

    private void initTabs() {
        fragmentTabHost.setup(this, getSupportFragmentManager());
        List<Module> modules = Module.get();
        for (Module module : modules) {
            TabHost.TabSpec tabSpec = fragmentTabHost.newTabSpec(module.getTag());
            tabSpec.setIndicator(module.getName(), getResources().getDrawable(module.getIcon()));
            fragmentTabHost.addTab(tabSpec, module.getCls(), null);
        }
        fragmentTabHost.getTabWidget().setDividerDrawable(null);
        fragmentTabHost.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String tabId) {
        if (currentFragment != null) {
            currentFragment.setUserVisibleHint(false);
        }
        String tag = fragmentTabHost.getCurrentTabTag();
        FragmentManager fragmentManager = getSupportFragmentManager();
        currentFragment = fragmentManager.findFragmentByTag(tag);
        currentFragment.setUserVisibleHint(true);
    }
}
