//
//  AdaE
//
//  Created by DELL on 2019-10-16 15:54:57
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.test.ada;

import java.util.List;
import com.mdx.framework.adapter.MAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;

import com.ndtlg.test.item.E;

public class AdaE extends MAdapter<String>{

   public AdaE(Context context, List<String> list) {
        super(context, list);
    }


 	@Override
    public View getview(int position, View convertView, ViewGroup parent) {
        String item = get(position);
        if (convertView == null) {
            convertView = E.getView(getContext(), parent);;
        }
        E mE=(E) convertView.getTag();
        mE.set(item);
        return convertView;
    }
}
