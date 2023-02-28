package com.example.feng.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.my_webview)

        webViewSetup()
    }

    private fun webViewSetup() {
        myWebView.webViewClient = WebViewClient()

        myWebView.apply {
            loadUrl("https://github.com/trinifeng")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        if (myWebView.canGoBack())
            myWebView.goBack()
        else
            super.onBackPressed()
    }
}