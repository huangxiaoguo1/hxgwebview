package tsou.cn.lib_webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/**
 * Created by admin on 2018/6/6.
 */

public interface WebViewClientListener {

    public void shouldOverrideUrlLoading(WebView view, String url);

    public void onPageStarted(WebView view, String url, Bitmap favicon);

    public void onPageFinished(WebView view, String url);

    WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request);

    void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error);

    void onLoadResource(WebView view, String url);
}
