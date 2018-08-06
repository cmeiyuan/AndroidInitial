package androidinitial.cmeiyuan.com.androidinitial.dataobject;

import java.util.ArrayList;
import java.util.List;

import androidinitial.cmeiyuan.com.androidinitial.R;
import androidinitial.cmeiyuan.com.androidinitial.fragment.HomeFragment;
import androidinitial.cmeiyuan.com.androidinitial.fragment.MineFragment;
import androidinitial.cmeiyuan.com.androidinitial.fragment.OrderFragment;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class Module {

    private static List<Module> modules = new ArrayList<>();

    static {
        modules.add(new Module("首页", R.drawable.tabwidget_icon_home, "home", HomeFragment.class));
        modules.add(new Module("订单", R.drawable.tabwidget_icon_order, "order", OrderFragment.class));
        modules.add(new Module("我的", R.drawable.tabwidget_icon_mine, "mine", MineFragment.class));
    }

    public static List<Module> get() {
        return modules;
    }

    private String name;
    private int icon;
    private String tag;
    private Class<?> cls;

    public Module(String name, int icon, String tag, Class<?> cls) {
        this.name = name;
        this.icon = icon;
        this.tag = tag;
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
