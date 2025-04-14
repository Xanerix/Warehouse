package com.ThunderGod.warehouse.UI;

import android.app.Activity;
import android.widget.LinearLayout;

import com.ThunderGod.warehouse.TGmixed;
import com.ThunderGod.warehouse.TView;
import com.ThunderGod.warehouse.TextButton;

public class World {
    public static boolean world1 = false;

    public static LinearLayout WorldUI(Activity context) {
        final LinearLayout WorldUI = TView.TView(context, null, "CT", 1, null, null, "#00000000", 50, "TB", 0, null, null);
        TextButton.TextButton(context, WorldUI, "世界", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, world1, null);
        return WorldUI;
    }
}
