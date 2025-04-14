package com.ThunderGod.warehouse.UI;
import com.ThunderGod.warehouse.*;
import com.ThunderGod.warehouse.UI.*;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.ContextThemeWrapper;
import android.app.Activity;
public class UI {
	public static boolean pvp=false;
	public static boolean move=false;
	public static boolean player=false;
    public static boolean world=false;
    public static boolean setup=false;
	public static LinearLayout TGUI1a;
	public static LinearLayout TGUI1b;
	public static LinearLayout TGUI1c;
    public static LinearLayout TGUI1d;
    public static LinearLayout TGUI1e;
    public static PopupWindow TGtexts;
    public static PopupWindow TGUIs;
    public static void TGtext(final Context context, final Activity context1) {
        final LinearLayout TGtext1=TView.TView(context, null, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.09), "#00000000", 0, "RT", 0, 
            new View.OnClickListener(){
                @Override
				public void onClick(View view) {
                    TGUI(context, context1);
                    TGtexts.dismiss();
                }}
            , null);
        final TextView TGUI1atext=Ttext.Ttext(context, TGtext1, TGmixed.FontColor("§lOnline Line") , 20, "#ffffff", "CC", "#ffffffff", 5, 1, 1);
        TGtexts = Tpopup.TCdv(TGtext1, TGtext1, "LT", false, true, true, false, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.09), "Di", 0, 0);
    }


    public static void TGUI(final Context context, final Activity context1) {
        final LinearLayout TGUI1=TView.TView(context, null, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.5), "#ffffff", 30, "RT", 0, null, null);
        TGUI1.setElevation(30);

        TGUI1a = TView.TView(context, TGUI1, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), "#ffffff", new int[]{30,30,0,0}, "RT", 0,
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    UI1.SGclick(context, PVP.PVPUI(context1));
                    
                    if (pvp == false) {
                        Elevation(TGUI1a, 0, 30);

                        if (move == true) {
                            Elevation(TGUI1b, 30, 0);
                        }
                        if (player == true) {
                            Elevation(TGUI1c, 30, 0);
                        }
                        if (world == true) {
                            Elevation(TGUI1d, 30, 0);
                        }
                        if (setup == true) {
                            Elevation(TGUI1e, 30, 0);
                        }
                        pvp = true;
                        move = false;
                        world = false;
                        player = false;
                        setup = false;
                    } else
                    if (pvp == true) {
                        Elevation(TGUI1a, 30, 0);
                        UI1.scv.dismiss();
                        pvp = false;
                    }
                }
            }
            , 
            new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View view1) {
                    TGUIs.dismiss();
                    TGtext(context, context1);
                    if(pvp==true){
                        UI1.scv.dismiss();
                        pvp=false;
                    }
                    if(move==true){
                        UI1.scv.dismiss();
                        move=false;
                    }
                    if(world==true){
                        UI1.scv.dismiss();
                        world=false;
                    }
                    if(player==true){
                        UI1.scv.dismiss();
                        player=false;
                    }
                    if(setup==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    return true;
                }}
        );
        TGUI1b = TView.TView(context, TGUI1, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), "#ffffff", new int[]{0,0,0,0}, "RT", 0,
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if (move == false) {
                        UI1.SGclick(context, Move.MoveUI(context1));
                        Elevation(TGUI1b, 0, 30);

                        if (pvp == true) {
                            Elevation(TGUI1a, 30, 0);
                        }
                        if (player == true) {
                            Elevation(TGUI1c, 30, 0);
                        }
                        if (world == true) {
                            Elevation(TGUI1d, 30, 0);
                        }
                        if (setup == true) {
                            Elevation(TGUI1e, 30, 0);
                        }
                        move = true;
                        pvp = false;
                        world = false;
                        player = false;
                        setup = false;
                    } else
                    if (move == true) {
                        Elevation(TGUI1b, 30, 0);
                        UI1.scv.dismiss();
                        move = false;
                    }
		   		}
            }
            , 
            new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View view1) {
                    TGUIs.dismiss();
                    TGtext(context, context1);
                    if(pvp==true){
                        UI1.scv.dismiss();
                        pvp=false;
                    }
                    if(move==true){
                        UI1.scv.dismiss();
                        move=false;
                    }
                    if(world==true){
                        UI1.scv.dismiss();
                        world=false;
                    }
                    if(player==true){
                        UI1.scv.dismiss();
                        player=false;
                    }
                    if(setup==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    return true;
                }}
        );
        TGUI1c = TView.TView(context, TGUI1, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), "#ffffff", new int[]{0,0,0,0}, "RT", 0,
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if (player == false) {
                        UI1.SGclick(context, Player.PlayerUI(context1));
                        Elevation(TGUI1c, 0, 30);

                        if (pvp == true) {
                            Elevation(TGUI1a, 30, 0);
                        }
                        if (move == true) {
                            Elevation(TGUI1b, 30, 0);
                        }
                        if (world == true) {
                            Elevation(TGUI1d, 30, 0);
                        }
                        if (setup == true) {
                            Elevation(TGUI1e, 30, 0);
                        }
                        player = true;
                        pvp = false;
                        world = false;
                        move = false;
                        setup = false;
                    } else
                    if (player == true) {
                        Elevation(TGUI1c, 30, 0);
                        UI1.scv.dismiss();
                        player = false;
                    }
			    }
            }
            , 
            new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View view1) {
                    TGUIs.dismiss();
                    TGtext(context, context1);
                    if(pvp==true){
                        UI1.scv.dismiss();
                        pvp=false;
                    }
                    if(move==true){
                        UI1.scv.dismiss();
                        move=false;
                    }
                    if(world==true){
                        UI1.scv.dismiss();
                        world=false;
                    }
                    if(player==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    if(setup==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    return true;
                }}
        );
        TGUI1d = TView.TView(context, TGUI1, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), "#ffffff", new int[]{0,0,0,0}, "RT", 0,
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if (world == false) {
                        UI1.SGclick(context, World.WorldUI(context1));
                        Elevation(TGUI1d, 0, 30);

                        if (pvp == true) {
                            Elevation(TGUI1a, 30, 0);
                        }
                        if (move == true) {
                            Elevation(TGUI1b, 30, 0);
                        }
                        if (player == true) {
                            Elevation(TGUI1c, 30, 0);
                        }
                        if (setup == true) {
                            Elevation(TGUI1e, 30, 0);
                        }
                        world = true;
                        player = false;
                        pvp = false;
                        move = false;
                        setup = false;
                    } else
                    if (world == true) {
                        Elevation(TGUI1d, 30, 0);
                        UI1.scv.dismiss();
                        world = false;
                    }
                }
            }
            , 
            new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View view1) {
                    TGUIs.dismiss();
                    TGtext(context, context1);
                    if(pvp==true){
                        UI1.scv.dismiss();
                        pvp=false;
                    }
                    if(move==true){
                        UI1.scv.dismiss();
                        move=false;
                    }
                    if(world==true){
                        UI1.scv.dismiss();
                        world=false;
                    }
                    if(player==true){
                        UI1.scv.dismiss();
                        player=false;
                    }
                    if(setup==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    return true;
                }}
        );
        TGUI1e = TView.TView(context, TGUI1, "CC", 1, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.1), "#ffffff", new int[]{0,0,30,30}, "RT", 0,
            new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    if (setup == false) {
                        Elevation(TGUI1e, 0, 30);
                        UI1.SGclick(context, SetUP.SetUPUI(context1));
                        if (pvp == true) {
                            Elevation(TGUI1a, 30, 0);
                        }
                        if (move == true) {
                            Elevation(TGUI1b, 30, 0);
                        }
                        if (player == true) {
                            Elevation(TGUI1c, 30, 0);
                        }
                        if (world == true) {
                            Elevation(TGUI1d, 30, 0);
                        }
                        setup = true;
                        world = false;
                        player = false;
                        pvp = false;
                        move = false;
                    } else
                    if (setup == true) {
                        Elevation(TGUI1e, 30, 0);
                        UI1.scv.dismiss();
                        setup = false;
                    }
                }
            }
            , new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View view1) {
                    TGUIs.dismiss();
                    TGtext(context, context1);
                    if(pvp==true){
                        UI1.scv.dismiss();
                        pvp=false;
                    }
                    if(move==true){
                        UI1.scv.dismiss();
                        move=false;
                    }
                    if(world==true){
                        UI1.scv.dismiss();
                        world=false;
                    }
                    if(player==true){
                        UI1.scv.dismiss();
                        player=false;
                    }
                    if(setup==true){
                        UI1.scv.dismiss();
                        setup=false;
                    }
                    return true;
                }}
        );

        final TextView TGUI1atext=Ttext.Ttext(context, TGUI1a, TGmixed.FontColor("§l攻击") , 15, "#000000", "CC", "#000000", 3, 1, 1);
        final TextView TGUI1btext=Ttext.Ttext(context, TGUI1b, TGmixed.FontColor("§l移动") , 15, "#000000", "CC", "#000000", 3, 1, 1);
        final TextView TGUI1ctext=Ttext.Ttext(context, TGUI1c, TGmixed.FontColor("§l玩家") , 15, "#000000", "CC", "#000000", 3, 1, 1);
        final TextView TGUI1dtext=Ttext.Ttext(context, TGUI1d, TGmixed.FontColor("§l世界") , 15, "#000000", "CC", "#000000", 3, 1, 1);
        final TextView TGUI1etext=Ttext.Ttext(context, TGUI1e, TGmixed.FontColor("§l设置") , 15, "#000000", "CC", "#000000", 3, 1, 1);
        TGUIs = Tpopup.TCdv(TGUI1, TGUI1, "LT", false, true, true, false, (int)(TGmixed.W(context) * 0.15), (int)(TGmixed.H(context) * 0.5), "In", 0, 0);
	}
	public static void Elevation(final LinearLayout view, int values1, int values2) {
		local.ValueAnimator(view, values1, values2, 300, 0, new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    int values = (int) animation.getAnimatedValue();
                    view.setElevation(values);
                }});

	}


}
