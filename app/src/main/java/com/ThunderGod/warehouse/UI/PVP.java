package com.ThunderGod.warehouse.UI;
import com.ThunderGod.warehouse.*;
import android.widget.LinearLayout;
import android.content.Context;
import android.app.Activity;
public class PVP {
    public static boolean pvp1=false;
    public static LinearLayout PVPUI(Activity context){
        final LinearLayout PVP=TView.TView(context, null, "CT", 1,null, null, "#00000000", 50, "TB", 0,null,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        TextButton.TextButton(context,PVP,"测试",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,pvp1,null);
        return PVP;
    }
}
