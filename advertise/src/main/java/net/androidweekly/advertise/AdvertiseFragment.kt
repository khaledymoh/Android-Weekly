package net.androidweekly.advertise


import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import net.androidweekly.core.fragments.BaseFragment
import net.androidweekly.core.utils.android.bindView

/**
 * Project: Android Weekly
 * Created: November 25, 2019
 *
 * @author Khaled Mohammad
 */
class AdvertiseFragment : BaseFragment() {

    private val advertiseWebView: WebView? by bindView(R.id.web_view_fragment_advertise)
    private val progressBar: ProgressBar? by bindView(R.id.progress_bar_fragment_advertise)

    override val layoutId: Int = R.layout.fragment_advertise

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initWebViewClient()

        loadUrl()
    }

    private fun loadUrl() {
        advertiseWebView?.loadUrl(ADVERTISE_URL)
    }

    private fun initWebViewClient() {
        advertiseWebView?.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                progressBar?.visibility = View.GONE
            }
        }
    }

    private companion object {

        private const val ADVERTISE_URL = "https://androidweekly.net/jobs/new"
    }
}

