package webview.weeg.andy.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.view.KeyEvent.KEYCODE_BACK;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    String url="http://m.baidu.com";//"http://baidu.com";
    String url1="http://58.216.232.222:8090/WeegWebApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.canGoBack();
        webView.canGoForward();

        webView.setWebViewClient(new WebViewClient());
/*
        //是否可以后退
        Webview.canGoBack()
//后退网页
        Webview.goBack()

//是否可以前进
        Webview.canGoForward()
//前进网页
        Webview.goForward()
        */
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
