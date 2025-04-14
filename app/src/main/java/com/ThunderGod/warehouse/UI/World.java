package com.ThunderGod.warehouse.UI;

import android.widget.LinearLayout;
import android.app.Activity;

import com.ThunderGod.warehouse.*;

public class World {
    public static boolean world1 = false;

    public static LinearLayout WorldUI(Activity context) {
        final LinearLayout WorldUI = TView.TView(context, null, "CT", 1, null, null, "#00000000", 50, "TB", 0, null, null);
        TextButton.TextButton(context, WorldUI, "世界", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, world1, null);
        return WorldUI;
    }
}
