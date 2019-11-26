package tsou.cn.lib_webview;

import android.graphics.Bitmap;
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
}
