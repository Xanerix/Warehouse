package com.ThunderGod.warehouse;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

public class roundRect {

    // 算法来自于Answer
    public static GradientDrawable roundBG(Object hex, Object round, String f, Object s) {
        if (isArray(hex)) {
            String[] hex2 = (String[]) hex;
            return roundRect(new int[]{Color.parseColor(hex2[0]), Color.parseColor(hex2[1])}, round, f, s);
        } else {
            return roundRect(Color.parseColor((String) (hex)), round, f, s);
        }
    }

    public static GradientDrawable roundBGS(Object hex, Object round, String f, Object s) {
        return roundRect(hex, round, f, s);
    }

    public static GradientDrawable roundRect(Object arr, Object arr2, String f, Object s) {
        int[] arrs = null;
        float[] arrs2 = null;
        GradientDrawable.Orientation jb = null;
        int type = 0;
        GradientDrawable background = new GradientDrawable();

        if (!isArray(arr)) {
            // 转换为Integer后再转为int
            Integer intValue = (arr instanceof Integer) ? (Integer) arr : 0;
            arrs = new int[]{intValue, intValue, intValue};
            background.setColors(arrs);
        } else {
            background.setColors((int[]) (arr));
        }

        if (!isArray(arr2)) {
            if (arr2 != null) {
                // 确保arr2可以转换为数字
                float floatValue = (arr2 instanceof Number) ? ((Number) arr2).floatValue() : 0f;
                arrs2 = new float[]{floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue};
                background.setCornerRadii(arrs2);
            }
        } else {
            if (arr2 instanceof int[]) {
                int[] arr2s = (int[]) (arr2);
                arrs2 = new float[]{arr2s[0], arr2s[0], arr2s[1], arr2s[1], arr2s[2], arr2s[2], arr2s[3], arr2s[3]};
                background.setCornerRadii(arrs2);
            }
        }

        if (arr2 == null) {
            float[] arr2s = new float[]{10, 10, 10, 10, 10, 10, 10, 10};
            background.setCornerRadii(arr2s);
        }

        if ("TB".equals(f) || f == null) {
            jb = GradientDrawable.Orientation.TOP_BOTTOM; // 上下
        } else if ("LR".equals(f)) {
            jb = GradientDrawable.Orientation.LEFT_RIGHT; // 左右
        } else if ("RT".equals(f)) {
            jb = GradientDrawable.Orientation.BL_TR; // 右上
        } else if ("RB".equals(f)) {
            jb = GradientDrawable.Orientation.TL_BR; // 右下
        }

        // 正确比较对象与整数
        if (s == null || (s instanceof Integer && ((Integer) s) == 0)) {
            type = GradientDrawable.LINEAR_GRADIENT;
        } else if (s instanceof Integer && ((Integer) s) == 1) {
            type = GradientDrawable.RADIAL_GRADIENT;
        } else if (s instanceof Integer && ((Integer) s) == 2) {
            type = GradientDrawable.SWEEP_GRADIENT;
        }

        background.setShape(GradientDrawable.RECTANGLE);
        background.setGradientType(type);
        background.setOrientation(jb);
        return background;
    }

    public static int hexColor(String c) {
        return android.graphics.Color.parseColor(c);
    }

    public static boolean isArray(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }
}