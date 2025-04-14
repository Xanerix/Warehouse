package com.ThunderGod.warehouse;

import android.widget.PopupWindow;
import android.widget.LinearLayout;
import android.view.Gravity;
import android.view.View;

public class Tpopup {

    // 只保留一个方法，使用Object类型参数并在内部进行转换
    public static PopupWindow TCdv(View decorView, LinearLayout layout, String gravity, Boolean fa, Boolean ta, Boolean ca, Boolean oa, Object w, Object h, String anim, Object X, Object Y) {
        final PopupWindow popupWindow = new PopupWindow(layout, android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT, android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(layout);
        if (anim == null || anim.equals("Di")) {
            popupWindow.setAnimationStyle(android.R.style.Animation_Dialog);
        } else if (anim.equals("In")) {
            popupWindow.setAnimationStyle(android.R.style.Animation_InputMethod);
        } else if (anim.equals("To")) {
            popupWindow.setAnimationStyle(android.R.style.Animation_Toast);
        } else if (anim.equals("Tr")) {
            popupWindow.setAnimationStyle(android.R.style.Animation_Translucent);
        } else if (anim.equals("Ac")) {
            popupWindow.setAnimationStyle(android.R.style.Animation_Activity);
        }
        popupWindow.setFocusable(fa);//可返回关闭
        popupWindow.setTouchable(ta);//可触摸的
        popupWindow.setClippingEnabled(ca);//允许弹出窗口超出屏幕范围
        popupWindow.setOutsideTouchable(oa);//设置点击外部区域可以取消popupWindow

        // 处理宽度
        if (w != null) {
            int width;
            if (w instanceof Integer) {
                width = (Integer) w;
            } else if (w instanceof Double || w instanceof Float) {
                width = ((Number) w).intValue();
            } else {
                try {
                    width = Integer.parseInt(w.toString());
                } catch (NumberFormatException e) {
                    width = android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
                }
            }
            popupWindow.setWidth(width);
        }

        // 处理高度
        if (h != null) {
            int height;
            if (h instanceof Integer) {
                height = (Integer) h;
            } else if (h instanceof Double || h instanceof Float) {
                height = ((Number) h).intValue();
            } else {
                try {
                    height = Integer.parseInt(h.toString());
                } catch (NumberFormatException e) {
                    height = android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
                }
            }
            popupWindow.setHeight(height);
        }

        // 处理X和Y坐标
        int xPos = 0;
        if (X != null) {
            if (X instanceof Integer) {
                xPos = (Integer) X;
            } else if (X instanceof Double || X instanceof Float) {
                xPos = ((Number) X).intValue();
            } else {
                try {
                    xPos = Integer.parseInt(X.toString());
                } catch (NumberFormatException e) {
                    xPos = 0;
                }
            }
        }

        int yPos = 0;
        if (Y != null) {
            if (Y instanceof Integer) {
                yPos = (Integer) Y;
            } else if (Y instanceof Double || Y instanceof Float) {
                yPos = ((Number) Y).intValue();
            } else {
                try {
                    yPos = Integer.parseInt(Y.toString());
                } catch (NumberFormatException e) {
                    yPos = 0;
                }
            }
        }

        // 设置位置
        if (gravity.equals("CT")) {
            popupWindow.showAtLocation(decorView, Gravity.CENTER | Gravity.TOP, xPos, yPos);
        } else if (gravity.equals("CC")) {
            popupWindow.showAtLocation(decorView, Gravity.CENTER | Gravity.CENTER, xPos, yPos);
        } else if (gravity.equals("CB")) {
            popupWindow.showAtLocation(decorView, Gravity.CENTER | Gravity.BOTTOM, xPos, yPos);
        } else if (gravity.equals("LT")) {
            popupWindow.showAtLocation(decorView, Gravity.LEFT | Gravity.TOP, xPos, yPos);
        } else if (gravity.equals("LC")) {
            popupWindow.showAtLocation(decorView, Gravity.LEFT | Gravity.CENTER, xPos, yPos);
        } else if (gravity.equals("LB")) {
            popupWindow.showAtLocation(decorView, Gravity.LEFT | Gravity.BOTTOM, xPos, yPos);
        } else if (gravity.equals("RT")) {
            popupWindow.showAtLocation(decorView, Gravity.RIGHT | Gravity.TOP, xPos, yPos);
        } else if (gravity.equals("RC")) {
            popupWindow.showAtLocation(decorView, Gravity.RIGHT | Gravity.CENTER, xPos, yPos);
        } else if (gravity.equals("RB")) {
            popupWindow.showAtLocation(decorView, Gravity.RIGHT | Gravity.BOTTOM, xPos, yPos);
        }

        return popupWindow;
    }
}