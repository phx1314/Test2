package com.ndtlg.test;

import android.app.Activity;
import android.os.Bundle;

import com.mdx.framework.activity.IndexAct;
import com.mdx.framework.util.Helper;
import com.ndtlg.test.frg.FrgTest;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Helper.startActivity(this, FrgTest.class, IndexAct.class);
    }
}
