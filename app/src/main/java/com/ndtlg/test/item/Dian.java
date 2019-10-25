//
//  Dian
//
//  Created by DELL on 2019-10-15 13:05:56
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.test.item;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ndtlg.test.R;


public class Dian extends BaseItem{
    public TextView mTextView_dian;


	@SuppressLint("InflateParams")
    public static View getView(Context context,ViewGroup parent){
	     LayoutInflater flater = LayoutInflater.from(context);
	     View convertView = flater.inflate(R.layout.item_dian,null);
	     convertView.setTag( new Dian(convertView));
	     return convertView;
	}

	public Dian(View view){
		this.contentview=view;
		this.context=contentview.getContext();
		initView();
	}
    
    private void initView() {
    	this.contentview.setTag(this);
    	findVMethod();
    }

    private void findVMethod(){
        mTextView_dian=(TextView)contentview.findViewById(R.id.mTextView_dian);


    }

    public void set(String item){

    }
    
    

}