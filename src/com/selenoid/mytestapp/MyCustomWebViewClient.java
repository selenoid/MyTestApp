package com.selenoid.mytestapp;

import android.app.Activity;
import android.webkit.WebViewClient;

public class MyCustomWebViewClient extends WebViewClient {
	
	public Activity app; 
	
	public MyCustomWebViewClient(Activity _app) {
		app = _app;
	}
	
	
/*
	@Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
		Log.d("DEBUG", "Ebenece...");
         if (url.indexOf("tel:") > -1) {
            app.startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(url)));
            return true;
        } else if(url.startsWith("http:") || url.startsWith("https:")) {
            view.loadUrl(url);
        }
        return true;
    }*/
	
}
