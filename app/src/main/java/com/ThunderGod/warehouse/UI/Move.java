package com.ThunderGod.warehouse.UI;
import android.widget.LinearLayout;
import android.app.Activity;
import com.ThunderGod.warehouse.*;
public class Move {
    public static boolean move1=false;
    public static LinearLayout MoveUI(Activity context){
        final LinearLayout MoveUI=TView.TView(context, null, "CT", 1,null, null, "#00000000", 50, "TB", 0,null,null);
        TextButton.TextButton(context,MoveUI,"移动",(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),50,false,move1,null);
        return MoveUI;
    }
    
    
}
