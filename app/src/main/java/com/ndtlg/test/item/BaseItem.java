//
//  BaseItem
//
//  Created by DELL on 2019-10-15 11:36:31
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.test.item;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

public class BaseItem implements OnClickListener {
	protected Context context;
	protected View contentview;

	@Override
	public void onClick(View v) {

	}

	public View findViewById(int id) {
         return this.contentview.findViewById(id);
    }

}

