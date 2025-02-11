package com.qlive.qnim

import android.content.Context
import com.qlive.rtm.RtmManager
import com.qlive.rtm.RtmUserListener

object QNIMManager {

    val mRtmAdapter by lazy { com.qlive.qnim.QNIMAdapter() }
    fun setRtmAdapter() {
        RtmManager.setRtmAdapter(mRtmAdapter)
    }

    fun init(appId: String, context: Context) {
        mRtmAdapter.init(QNIMConfig.imSDKConfigGetter.invoke(appId, context), context)
    }

    fun setRtmUserListener(rtmUserListener: RtmUserListener){
        mRtmAdapter.setRtmUserListener(rtmUserListener)
    }
}