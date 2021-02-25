package com.linda.module_base.webview

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.linda.module_base.R
import com.linda.module_base.constants.RouterPaths
import com.linda.module_base.ui.BaseActivity
import com.linda.module_base.utils.MyLogger
import kotlinx.android.synthetic.main.activity_webview.*

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020/9/9
 */
@Route(path = RouterPaths.WEBVIEW_ACTIVITY)
class WebViewActivity : BaseActivity() {

    @JvmField
    @Autowired(name = "url")
    var url: String? = null

    override fun getLayoutResId(): Int {
        return R.layout.activity_webview
    }

    override fun initView() {
        ARouter.getInstance().inject(this)
    }

    override fun initData() {
        MyLogger.e("linda", "url:   $url")
        url?.let { mWebView.loadUrl(it) }
    }
}