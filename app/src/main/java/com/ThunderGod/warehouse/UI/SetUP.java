package com.ThunderGod.warehouse.UI;
import com.ThunderGod.warehouse.*;
import android.widget.LinearLayout;
import android.content.Context;
import android.view.View;
import android.app.Activity;
import android.widget.PopupWindow;
import android.os.Handler;
import android.os.Looper;
public class SetUP {
    public static boolean setup1=false;
    public static boolean setup2=false;
    public static boolean setup3=false;
    public static String string=
    "作者:ThunderGod QQ:2702353980\n"+
    "库作者:ThunderGod QQ:2702353980\n"+
    "本库已开源，如要进行使用，请标明库作者\n"+
    "部分库来源Answer\n"+
    "感谢 Answer的UI写法指导 QQ:2903536884\n"+
    "感谢 苏沐橙，源起，源落。提供的Notice思路 QQ:3578557729\n"+
    "感谢 Nothing的Map与ArrayList写法指导 QQ:535481388\n"+
    "感谢排名不分先后\n"+
    "本JavaUI调用库将保持更新\n"+
    "可关注作者b站账号获取最新版本下载地址\n"+
    "UID:490266852\n"+
    "感谢各位用户的使用\n"+
    "如有bug请加我QQ联系 QQ:2702353980\n"+
    "UI借鉴于MIX.js的简易UI"
    ;
    public static LinearLayout SetUPUI(final Activity context) {
        final LinearLayout SetUP=TView.TView(context, null, "CT", 1, null, null, "#00000000", 50, "TB", 0, null, null);
        TextButton.TextButton(context, SetUP, "ModScript", (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), new int[]{50,50,50,50}, true, setup1,
            new View.OnClickListener(){  
                @Override
				public void onClick(View view) {
                    if (setup1 == false) {
                        setup1 = true;
                        ModScript.ModScript(context);
                        //测试1(context);
                        Notice.Notice(context,"ModScript:true");
                    } else
                    if (setup1 == true) {
                        setup1 = false;
                        //cs1.dismiss();
                        ModScript.ModScriptUI.dismiss();
                        Notice.Notice(context,"ModScript:false");
                    }

                }});
                final LinearLayout toast4=TView.TView(context,null,"CC",0,(int)(TGmixed.W(context) * 0.15),(int)(TGmixed.H(context) * 0.1),"#000000",30,"RT",0,null,null);
        TextButton.TextButton(context, SetUP, "关于本库", (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), new int[]{50,50,50,50}, false, false,
        new View.OnClickListener(){  
                @Override
				public void onClick(View view1) {
                TextUI.TextUI(context,"关于本库",string);
                  }});
        TextButton.TextButton(context, SetUP, "测试", (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), new int[]{50,50,50,50}, false, setup3, null);
               /*
                                                      长                                  宽
         TextButton.TextButton(context, 上层布局, 文本, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), 圆角大小, 是否点击换色, 判断的布尔值,
         new View.OnClickListener(){  
         @Override
         public void onClick(View view) {
         if (判断的布尔值 == false) {
         判断的布尔值 = true;
         
         } else
         if (判断的布尔值 == true) {
         判断的布尔值 = false;
     
         }
         如果要点击不换色，让是否换色为false  判断的布尔值为false 点击器里不用加if
         }});
        */
                
        return SetUP;
    }
}
