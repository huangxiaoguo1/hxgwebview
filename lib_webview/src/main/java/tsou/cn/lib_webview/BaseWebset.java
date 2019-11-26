package tsou.cn.lib_webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by admin on 2018/6/6.
 */

public class BaseWebset {


    public WebViewClientListener webViewClientListener;
    public WebChromeClientListener webChromeClientListener;


    public void setWebViewClient(WebView mWebView) {
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                if (webViewClientListener != null) {
                    webViewClientListener.shouldInterceptRequest(view, request);
                }
                return super.shouldInterceptRequest(view, request);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (webViewClientListener != null) {
                    webViewClientListener.shouldOverrideUrlLoading(view, url);
                } else {
                    view.loadUrl(url);
                }
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (webViewClientListener != null) {
                    webViewClientListener.onPageStarted(view, url, favicon);
                }
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (webViewClientListener != null) {
                    webViewClientListener.onPageFinished(view, url);
                }
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();//接受所有https证书
            }
        });
    }

    public void setWebChromeClient(WebView mWebView) {
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                if (webChromeClientListener != null) {
                    webChromeClientListener.onReceivedTitle(view, title);
                }
            }

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (webChromeClientListener != null) {
                    webChromeClientListener.onProgressChanged(view, newProgress);
                }
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                callback.invoke(origin, true, false);
                if (webChromeClientListener != null) {
                    webChromeClientListener.onGeolocationPermissionsShowPrompt(origin, callback);
                }
                super.onGeolocationPermissionsShowPrompt(origin, callback);
            }
        });
    }


}
