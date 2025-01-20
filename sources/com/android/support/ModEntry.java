package com.android.support;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public final class ModEntry implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = loadPackageParam != null ? loadPackageParam.packageName : null;
        if (str != null && str.equals("com.miHoYo.Nap.bilibili")) {
            System.loadLibrary("dewadw");
        }
    }
}
