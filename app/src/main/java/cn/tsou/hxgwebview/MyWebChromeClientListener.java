package cn.tsou.hxgwebview;

import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.WebView;

import tsou.cn.lib_webview.WebChromeClientListener;

/**
 * Created by Administrator on 2018/7/13 0013.
 */

public class MyWebChromeClientListener implements WebChromeClientListener {
    public MyWebChromeClientListener(){

    }
    @Override
    public void onReceivedTitle(WebView view, String title) {
        Log.e("huangxiaoguo","onReceivedTitle==>"+title);
    }

    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {

    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {

    }
}

