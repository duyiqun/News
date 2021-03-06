package com.qun.news.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.qun.news.act.HomeActivity;

/**
 * Created by Qun on 2017/4/22.
 */

public abstract class BaseFragment extends Fragment {

    public Context mContext;
    public SlidingMenu mSlidingMenu;
    public MenuFragment2 mMenuFragment;

    //初始化方法
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        mSlidingMenu = ((HomeActivity) mContext).getSlidingMenu();
        mMenuFragment = ((HomeActivity) mContext).getMenuFragment();
    }

    //界面初始化方法
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = initView(inflater);
        return view;
    }

    public abstract View initView(LayoutInflater inflater);

    //数据初始化方法
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected abstract void initData();
}
