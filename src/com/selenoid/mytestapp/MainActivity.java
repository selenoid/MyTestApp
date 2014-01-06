package com.selenoid.mytestapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.selenoid.mytestapp.util.AndroidBridge;



public class MainActivity extends Activity {
	
	public WebView myWebView; 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		myWebView = (WebView) findViewById(R.id.webview);
		myWebView.setWebViewClient(new MyCustomWebViewClient(this));
		myWebView.getSettings().setJavaScriptEnabled(true);
		
		myWebView.loadUrl("file:///android_asset/index.html");
		
		// must be after loadUrl on lower apis
		myWebView.addJavascriptInterface(new AndroidBridge(this), "AndroidBridge");
		
	}
	
	public void changeText (String textVal)
	{
		Log.d("myApp", "change text : " + textVal);
	}

}