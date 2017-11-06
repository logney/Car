package com.pengyu.car

import android.content.Context
import android.util.AttributeSet
import android.view.View

import ren.qinc.numberbutton.NumberButton

/**
 * Created by PengYu on 2017/11/6.
 */

class MyNumberButton : NumberButton {

    private var changeListener: ChangeListener? = null

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun onClick(v: View) {
        super.onClick(v)
        if (changeListener != null) {
            changeListener!!.change()
        }
    }

    interface ChangeListener {
        fun change()
    }

    fun setOnChangeListener(changeListener: ChangeListener) {
        this.changeListener = changeListener
    }
}
