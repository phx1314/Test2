//
//  AdaDian
//
//  Created by DELL on 2019-10-15 13:05:56
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.test.ada;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.mdx.framework.adapter.MAdapter;
import com.ndtlg.test.item.Dian;

import java.util.List;

public class AdaDian extends MAdapter<String>{

   public AdaDian(Context context, List<String> list) {
        super(context, list);
    }


 	@Override
    public View getview(int position, View convertView, ViewGroup parent) {
        String item = get(position);
        if (convertView == null) {
            convertView = Dian.getView(getContext(), parent);;
        }
        Dian mDian=(Dian) convertView.getTag();
        mDian.set(item);
        return convertView;
    }
}
