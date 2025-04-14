package com.ThunderGod.warehouse.UI;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.ThunderGod.warehouse.TGmixed;
import com.ThunderGod.warehouse.TView;
import com.ThunderGod.warehouse.Tpopup;

public class UI1 {
    public static PopupWindow scv;
    public static PopupWindow scv1;

    public static void SGclick(Context context, LinearLayout addui) {
        if (scv != null) {
            scv.dismiss();
        }
        LinearLayout scl = TView.TView(context, null, "CC", 1, null, null, "#ffffff", 30, "TB", 0, null, null);
        scl.addView(addui);
        scv = Tpopup.TCdv(scl, scl, "LT", false, true, true, false, (int) (TGmixed.W(context) * 0.15), -2, "Tr", (int) (TGmixed.W(context) * 0.15) + 80, 0);
    }

    public static void SGclick1(Context context, LinearLayout addui) {
        if (scv1 != null) {
            scv1.dismiss();
        }
        LinearLayout scl = TView.TView(context, null, "CC", 1, null, null, "#ffffff", 50, "TB", 0, null, null);
        scl.addView(addui);
        scv1 = Tpopup.TCdv(scl, scl, "CC", false, true, true, false, (int) (TGmixed.W(context) * 0.15), -2, "Tr", (int) (TGmixed.W(context) * 0.15) + 80, 0);
    }
}
