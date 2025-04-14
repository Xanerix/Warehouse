package com.ThunderGod.warehouse.UI;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;

import com.ThunderGod.warehouse.ButtonMove;
import com.ThunderGod.warehouse.TGmixed;

public class button {
    PopupWindow cs1;
    PopupWindow cs2;
    private boolean c = false;

    //快捷按钮事例
    public void 测试1(Activity context) {
        cs1 = ButtonMove.ButtonMove(context, "测1", (int) (TGmixed.H(context) * 0.1), (int) (TGmixed.H(context) * 0.1), 200, 200, true, c, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toasts.Toasts(getApplicationContext(), "测试T", "cs");
                c = c;
            }
        });
    }

    public void 测试2(Activity context) {
        cs2 = ButtonMove.ButtonMove(context, "测2", (int) (TGmixed.H(context) * 0.1), (int) (TGmixed.H(context) * 0.1), 500, 200, false, false, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toasts.Toasts(getApplicationContext(), "测试T", "Ts");
                //jss=true;
            }
        });
    }


}
