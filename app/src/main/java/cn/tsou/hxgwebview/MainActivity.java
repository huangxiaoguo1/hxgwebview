package cn.tsou.hxgwebview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import tsou.cn.lib_webview.JsInteraction;
import tsou.cn.lib_webview.WebChromeClientListener;
import tsou.cn.lib_webview.WebViewClientListener;
import tsou.cn.lib_webview.Webset;

public class MainActivity extends AppCompatActivity {

    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mWebview = (WebView) findViewById(R.id.webview);
        Webset.newInstance().with(this, mWebview)
                .url("https://blog.csdn.net/huangxiaoguo1")
                .url("http://sycs.dashouzhang.org/bone//app/meeting/fxorganization_show.json?uid=f39c5c5c651df8c201651e06a0300005&meetShow=1")
                .setCacheEnable(true)
                .setWebViewClient(new MyWebViewClientListener())
//                .setWebChromeClient(new MyWebChromeClientListener())
//                .setJavaScriptEnabled(true,"hahaha",new MyJsInteraction(this))
                .setJavaScriptEnabled(true,null,null)
                .setWebsetting();
    }
}
