package com.ThunderGod.warehouse.UI;

import android.app.Activity;
import android.widget.LinearLayout;

import com.ThunderGod.warehouse.TGmixed;
import com.ThunderGod.warehouse.TView;
import com.ThunderGod.warehouse.TextButton;

public class PVP {
    public static boolean pvp1 = false;

    public static LinearLayout PVPUI(Activity context) {
        final LinearLayout PVP = TView.TView(context, null, "CT", 1, null, null, "#00000000", 50, "TB", 0, null, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        TextButton.TextButton(context, PVP, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, pvp1, null);
        return PVP;
    }
}
