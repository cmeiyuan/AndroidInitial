package androidinitial.cmeiyuan.com.androidinitial.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meiyuan.module.common.ui.BaseActivity;

import androidinitial.cmeiyuan.com.androidinitial.R;
import androidinitial.cmeiyuan.com.androidinitial.router.Router;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.btn_register})
    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                startActivity(Router.login(this));
                break;
            case R.id.btn_register:
                startActivity(Router.register(this));
                break;
        }
    }

}
