package com.jues.crashlogcatlibrary;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;

/**
 * Created by Android Studio .
 * 作者：zhong
 * 日期：2018/10/9
 * 邮箱：15206394364@163.com
 * 介绍：
 * 修订：====================
 */
public class Function {
    /**
     * 判断是否缺少权限
     */
    public static boolean lacksPermission(Context mContexts, String permission) {
        return ContextCompat.checkSelfPermission(mContexts, permission) ==
                PackageManager.PERMISSION_DENIED;
    }

    /**
     * 判断是否缺少权限
     */
    public static boolean lacksPermissions(Context mContexts, String[] permissions) {
        for (String permission : permissions) {
            boolean isLacks = ContextCompat.checkSelfPermission(mContexts, permission) ==
                    PackageManager.PERMISSION_DENIED;
            if (isLacks) return true;
        }
        return false;
    }
}
