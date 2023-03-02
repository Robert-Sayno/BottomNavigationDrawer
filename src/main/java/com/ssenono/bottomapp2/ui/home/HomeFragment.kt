package com.ssenono.bottomapp2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.ssenono.bottomapp2.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myProductView: WebView = view.findViewById(R.id.nav_home)
        myProductView.webViewClient = object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myProductView.loadUrl("https://www.mtn.co.ug/personal/")
        myProductView.settings.javaScriptEnabled
        myProductView.settings.allowContentAccess = true
        myProductView.settings.useWideViewPort = true
        myProductView.settings.domStorageEnabled = true
    }


}

