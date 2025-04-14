package com.ThunderGod.warehouse;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.PopupWindow;

import com.ThunderGod.warehouse.UI.UI;

public class MainActivity extends Activity {
    private static boolean c = false;
    TextButton TextButton = new TextButton();
    PopupWindow cs1;
    PopupWindow cs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TGmixed.hideStatusBar(this);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                UI.TGtext(MainActivity.this, MainActivity.this);

            }
        }, 1000);
    }

    public int W() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    public int H() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    public void 测试1() {
        cs1 = ButtonMove.ButtonMove(this, "测1", (int) (H() * 0.1), (int) (H() * 0.1), 200, 200, true, c, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasts.Toasts(getApplicationContext(), "测试T", "cs");
                c = !c;
            }
        });
    }

    public void 测试2() {
        cs2 = ButtonMove.ButtonMove(this, "测2", (int) (H() * 0.1), (int) (H() * 0.1), 500, 200, false, false, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasts.Toasts(getApplicationContext(), "测试T", "Ts");
                //jss=true;
            }
        });
    }

}



 
