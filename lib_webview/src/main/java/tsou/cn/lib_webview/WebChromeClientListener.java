package tsou.cn.lib_webview;

import android.webkit.GeolocationPermissions;
import android.webkit.WebView;

/**
 * Created by admin on 2018/6/6.
 */

public interface WebChromeClientListener {
    void onReceivedTitle(WebView view, String title);

    void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback);

    void onProgressChanged(WebView view, int newProgress);
}
