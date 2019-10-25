//
//  FrgTest
//
//  Created by DELL on 2019-10-15 13:14:05
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.test.frg;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.mdx.framework.util.GlideLoader;
import com.mdx.framework.view.Headlayout;
import com.ndtlg.test.R;
import com.ndtlg.test.bean.BeanLogin;
import com.wildma.pictureselector.PictureSelector;


public class FrgTest extends BaseFrg {

    public RelativeLayout mLinearLayout;
    public LinearLayout mLinearLayout_content;
    public ImageView mImageView;


    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_test);
        initView();
        loaddata();
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mLinearLayout = (RelativeLayout) findViewById(R.id.mLinearLayout);
        mLinearLayout_content = (LinearLayout) findViewById(R.id.mLinearLayout_content);
        mImageView = (ImageView) findViewById(R.id.mImageView);
        load("http://192.168.0.6:8001/login/autologin", new BeanLogin());
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PictureSelector
                        .create(getActivity(), PictureSelector.SELECT_REQUEST_CODE)
                        .selectPicture(true, 200, 200, 0, 0);
            }
        });
    }

    @Override
    public void onSuccess(String methodName, String content) {

    }

    public void loaddata() {
        GlideLoader.loadImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1571135807102&di=0fe63cdfba8a099d8abad10c3d988845&imgtype=0&src=http%3A%2F%2Fv3.easemob.com%2Fdata%2Fupload%2Fueditor%2F20170829%2F59a52d6cb04da.png", mImageView);


    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /*结果回调*/
        if (requestCode == PictureSelector.SELECT_REQUEST_CODE) {
            if (data != null) {
                String picturePath = data.getStringExtra(PictureSelector.PICTURE_PATH);
            }
        }
    }

    @Override
    public void setActionBar(Headlayout mHeadlayout) {
        mHeadlayout.setTitle("测试");
        mHeadlayout.setBgColor(Color.parseColor("#0BAFED"));
        mHeadlayout.setLeftBackground(com.framework.R.drawable.arrows_left);
        mHeadlayout.setGoBack();
    }


}