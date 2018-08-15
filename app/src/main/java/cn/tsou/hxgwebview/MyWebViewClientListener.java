package cn.tsou.hxgwebview;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;

import tsou.cn.lib_webview.WebViewClientListener;

/**
 * Created by Administrator on 2018/7/13 0013.
 */

public class MyWebViewClientListener implements WebViewClientListener {

    public MyWebViewClientListener(){

    }

    @Override
    public void shouldOverrideUrlLoading(WebView view, String url) {

    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Log.e("huangxiaoguo","onPageStarted==>"+url);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.e("huangxiaoguo","onPageFinished==>"+url);
    }
}
