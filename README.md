# hxgwebview

### 使用方法

```
allprojects {
        repositories {
            ...		        	
            maven { url 'https://jitpack.io' }
        }		
}

dependencies {
	   implementation 'com.github.huangxiaoguo1:hxgwebview:1.0.4'
}
```

### 基本使用

```
Webset.newInstance().with(mCtonext, mWebView).url("网页链接").setWebsetting();
```

### 用法
    
###### 传入webview对象
    
    with(this, mWebview)
    
    
###### 传入url链接

    url("https://blog.csdn.net/huangxiaoguo1")
    
###### 设置js缓存  默认是不支持的

    setCacheEnable(true)
    
###### 设置WebViewClient

    setWebViewClient(new MyWebViewClientListener())
    
```
实现WebViewClientListener接口

public class MyWebViewClientListener implements WebViewClientListener {

    public MyWebViewClientListener() {

    }

    @Override
    public void shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Log.e("huangxiaoguo", "onPageStarted==>" + url);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.e("huangxiaoguo", "onPageFinished==>" + url);
    }
}
```

###### 设置WebChromeClient
       
       setWebChromeClient(new MyWebChromeClientListener())
     

```
 
实现WebChromeClientListener接口

public class MyWebChromeClientListener implements WebChromeClientListener {
   
    public MyWebChromeClientListener(){

    }
   
    @Override
    public void onReceivedTitle(WebView view, String title) {
        Log.e("huangxiaoguo","onReceivedTitle==>"+title);
    }
}
```

###### 设置js交互  默认是不支持的

    setJavaScriptEnabled(true,"hahaha",new MyJsInteraction(this))
    
    
```
实现JsInteraction接口

public class MyJsInteraction extends JsInteraction {
   
    public MyJsInteraction(Context mContext) {
        super(mContext);
    }

   
    @JavascriptInterface
    public void getCommentCollectNum( String json){
        Log.e("huangxiaoguo","JS调用了Android的getCommentCollectNum方法>>>>>>>"+json);
    }
}

```

###### 设置websetting

    setWebsetting();
    
## 使用案例

```
    private void initView() {
        mWebview = (WebView) findViewById(R.id.webview);
        Webset.newInstance().with(this, mWebview)
                .url("https://blog.csdn.net/huangxiaoguo1")
                .setCacheEnable(true)
                .setWebViewClient(new MyWebViewClientListener())
                .setWebChromeClient(new MyWebChromeClientListener())
//                .setJavaScriptEnabled(true,"hahaha",new MyJsInteraction(this))
                .setJavaScriptEnabled(true,null,null)
                .setWebsetting();
    }
```
