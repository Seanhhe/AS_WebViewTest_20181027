package tw.sean.as_webviewtest_20181027;
/*
 * 01.點選app，再至File > New > Folder > Assets Folder
 * 02.至app > assets >新增html檔案
 *
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        initWebView();
    }

    private void initWebView () {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/brad01.html");//前兩根//是通訊協定，第三根/是Linux的根路徑
    }
}
