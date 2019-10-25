//
//  E
//
//  Created by DELL on 2019-10-16 15:54:57
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.test.item;

import com.ndtlg.test.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import android.view.View;
import android.widget.TextView;



public class E extends BaseItem{
    public TextView mTextView_dian;


	@SuppressLint("InflateParams")
    public static View getView(Context context,ViewGroup parent){
	     LayoutInflater flater = LayoutInflater.from(context);
	     View convertView = flater.inflate(R.layout.item_e,null);
	     convertView.setTag( new E(convertView));
	     return convertView;
	}

	public E(View view){
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