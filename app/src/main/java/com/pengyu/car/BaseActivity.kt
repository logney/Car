package com.pengyu.car

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import com.gyf.barlibrary.ImmersionBar
/**
 * Created by PengYu on 2017/11/6.
 */

abstract class  BaseActivity : AppCompatActivity() {
    private var imm: InputMethodManager? = null
    protected var mImmersionBar: ImmersionBar? = null

    /**
     * 是否可以使用沉浸式
     * Is immersion bar enabled boolean.
     *
     * @return the boolean
     */
    protected var isImmersionBarEnabled: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        //初始化沉浸式
        if (isImmersionBarEnabled)
            initImmersionBar()
        //view与数据绑定
        initView()

        //初始化数据
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.imm = null
        if (mImmersionBar != null)
            mImmersionBar!!.destroy()  //在BaseActivity里销毁
    }

    protected abstract fun setLayoutId(): Int

    private fun initImmersionBar() {
        //在BaseActivity里初始化
        mImmersionBar = ImmersionBar.with(this)
        mImmersionBar!!.init()
        mImmersionBar!!.titleBar(R.id.toolbar)
                .navigationBarColor(R.color.shape1)
                .init()
    }

    protected abstract fun initView()

    protected abstract fun initData()

    override fun finish() {
        super.finish()
        hideSoftKeyBoard()
    }

    fun hideSoftKeyBoard() {
        val localView = currentFocus
        if (this.imm == null) {
            this.imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        }
        if (localView != null && this.imm != null) {
            this.imm!!.hideSoftInputFromWindow(localView.windowToken, 2)
        }
    }
}

