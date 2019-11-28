package cn.tsou.hxgwebview;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

import tsou.cn.lib_webview.WebViewClientListener;

/**
 * Created by Administrator on 2018/7/13 0013.
 */

public class MyWebViewClientListener implements WebViewClientListener {

    public MyWebViewClientListener() {

    }

    @Override
    public void shouldOverrideUrlLoading(WebView view, String url) {
        Log.i("huangxiaoguo",url);
        if (url.startsWith("http") || url.startsWith("https") || url.startsWith("ftp")) {
            view.loadUrl(url);
        }
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Log.e("huangxiaoguo", "onPageStarted==>" + url);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.e("huangxiaoguo", "onPageFinished==>" + url);
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Log.e("huangxiaoguo", "onReceivedError==>" + error.getDescription().toString());
    }

    @Override
    public void onLoadResource(WebView view, String url) {

    }

}
