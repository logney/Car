package com.pengyu.car;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Created by PengYu on 2017/11/3.
 */

public interface SelectChangeListener {
    void goodsChangeS(@NotNull ArrayList<CarEntity.Goods> checkItem, boolean checkAllSJs);
}
