package androidinitial.cmeiyuan.com.androidinitial.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meiyuan.module.common.ui.BaseFragment;

import androidinitial.cmeiyuan.com.androidinitial.R;

/**
 * Created by cmeiyuan on 2018/8/5
 */
public class MineFragment extends BaseFragment {

    private int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        return view;
    }
}
