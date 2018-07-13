package cn.tsou.hxgwebview;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

import tsou.cn.lib_webview.JsInteraction;

/**
 * Created by Administrator on 2018/7/13 0013.
 */

public class MyJsInteraction extends JsInteraction {
    public MyJsInteraction(Context mContext) {
        super(mContext);
    }

    @JavascriptInterface
    public void getCommentCollectNum( String json){
        Log.e("huangxiaoguo","JS调用了Android的getCommentCollectNum方法>>>>>>>"+json);
    }
}
