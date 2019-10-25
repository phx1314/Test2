//
//  FrgLoading
//
//  Created by DELL on 2019-10-15 13:07:28
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.test.frg;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.mdx.framework.newMenu.SlidingFragment;
import com.ndtlg.test.R;


public class FrgLoading extends BaseFrg {


    public LinearLayout mLinearLayout_content;
    public RelativeLayout mLinearLayout;
    public SlidingFragment mSlidingFragment;
    public android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_loading);
        initView();
        loaddata();
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {


        mLinearLayout_content = (LinearLayout) findViewById(R.id.mLinearLayout_content);
        mLinearLayout = (RelativeLayout) findViewById(R.id.mLinearLayout);
    }

    public void loaddata() {
        mSlidingFragment = new SlidingFragment(this);
        fragmentManager = getActivity().getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.add(R.id.mLinearLayout_content, mSlidingFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        mSlidingFragment.addContentView(new FrgTest(), "首页",
                R.drawable.ic_launcher);
        mSlidingFragment.addContentView(new FrgTest(), "认证",
                R.drawable.ic_launcher);
        mSlidingFragment.addContentView(new FrgTest(), "我的",
                R.drawable.ic_launcher);
        WindowManager wm = (WindowManager) getContext().getSystemService(
                Context.WINDOW_SERVICE);
        mSlidingFragment.setFadeDegree(0.5f);
    }


}