package com.ThunderGod.warehouse.UI;

import android.app.Activity;
import android.widget.LinearLayout;

import com.ThunderGod.warehouse.TGmixed;
import com.ThunderGod.warehouse.TView;
import com.ThunderGod.warehouse.TextButton;

public class Player {
    public static boolean player1 = false;

    public static LinearLayout PlayerUI(Activity context) {
        final LinearLayout PlayerUI = TView.TView(context, null, "CT", 1, null, null, "#00000000", 50, "TB", 0, null, null);
        TextButton.TextButton(context, PlayerUI, "玩家", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        TextButton.TextButton(context, PlayerUI, "测试", (int) (TGmixed.W(context) * 0.15), (int) (TGmixed.H(context) * 0.1), 50, false, player1, null);
        return PlayerUI;
    }
}
