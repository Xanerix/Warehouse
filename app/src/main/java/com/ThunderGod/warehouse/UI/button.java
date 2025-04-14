package com.ThunderGod.warehouse.UI;
import android.widget.PopupWindow;
import com.ThunderGod.warehouse.*;
import android.app.Activity;
import android.view.View;
public class button {
    PopupWindow cs1;

    private boolean c=false;
    //快捷按钮事例
    public void 测试1(Activity context) {
        cs1 = ButtonMove.ButtonMove(context, "测1", (int)(TGmixed.H(context) * 0.1), (int)(TGmixed.H(context) * 0.1), 200, 200,true,c,  new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    //Toasts.Toasts(getApplicationContext(), "测试T", "cs");
                    if(c==false){
                        c=false;
                    }else{
                        c=true;
                    }
                }
            });
    }

    PopupWindow cs2;
    public void 测试2(Activity context) {
        cs2 = ButtonMove.ButtonMove(context, "测2", (int)(TGmixed.H(context) * 0.1), (int)(TGmixed.H(context) * 0.1), 500, 200, false, false,  new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    //Toasts.Toasts(getApplicationContext(), "测试T", "Ts");
                    //jss=true;
                }
            });
	}
    
    
}
