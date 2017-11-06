package com.pengyu.car;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import ren.qinc.numberbutton.NumberButton;

/**
 * Created by PengYu on 2017/11/6.
 */

public class MyNumberButton extends NumberButton {
    public MyNumberButton(Context context) {
        super(context);
    }

    public MyNumberButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        if (changeListener != null) {
            changeListener.change();
        }
    }

    interface ChangeListener {
        void change();
    }

    private ChangeListener changeListener;

    public void setOnChangeListener(ChangeListener changeListener) {
        this.changeListener = changeListener;
    }
}
