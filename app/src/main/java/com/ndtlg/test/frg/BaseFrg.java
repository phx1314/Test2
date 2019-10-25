//
//  BaseFrg
//
//  Created by DELL on 2019-10-15 13:07:28
//  Copyright (c) DELL All rights reserved.


/**
 *
 */

package com.ndtlg.test.frg;

import android.view.View;

import com.mdx.framework.activity.MFragment;
import com.mdx.framework.util.HttpResponseListener;
import com.mdx.framework.util.HttpResponseListenerSon;
import com.mdx.framework.util.HttpUtil;
import com.zhy.http.okhttp.OkHttpUtils;

public abstract class BaseFrg extends MFragment implements View.OnClickListener, HttpResponseListenerSon {

    @Override
    public void onClick(View v) {


    }

    public void load(String methodName, Object... mparams) {
        HttpUtil.load(getContext(), this, methodName, new HttpResponseListener(getContext(), this, methodName, true), mparams);
    }

    public void load(String methodName, Object obj) {
        HttpUtil.load(getContext(), this, methodName, new HttpResponseListener(getContext(), this, methodName, true), obj);
    }

    @Override
    public void onSuccess(String methodName, String content) {

    }

    @Override
    public void onDestroy() {
        OkHttpUtils.getInstance().cancelTag(this);
        super.onDestroy();
    }
}
