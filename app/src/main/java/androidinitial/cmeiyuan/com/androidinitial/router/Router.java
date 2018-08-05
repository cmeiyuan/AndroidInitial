package androidinitial.cmeiyuan.com.androidinitial.router;

import android.app.Activity;
import android.content.Intent;

import androidinitial.cmeiyuan.com.androidinitial.activity.LoginActivity;
import androidinitial.cmeiyuan.com.androidinitial.activity.RegisterActivity;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class Router {

    public static Intent login(Activity activity) {
        return new Intent(activity, LoginActivity.class);
    }

    public static Intent register(Activity activity) {
        return new Intent(activity, RegisterActivity.class);
    }

}
