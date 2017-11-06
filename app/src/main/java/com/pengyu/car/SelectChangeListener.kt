package com.pengyu.car

import com.chad.library.adapter.base.entity.MultiItemEntity

import java.util.ArrayList

/**
 * Created by PengYu on 2017/11/3.
 */

interface SelectChangeListener {
    fun goodsChangeS(checkItem: ArrayList<CarEntity.Goods>, checkAllSJs: Boolean)
}
