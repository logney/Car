package com.pengyu.car

import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.kyleduo.switchbutton.SwitchButton

/**
 * Created by PengYu on 2017/10/18.
 */

class CarAdapter(private val data: ArrayList<MultiItemEntity>, private val selectChangeListener: SelectChangeListener) : BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder>(data) {

    private var isDEL = false

    init {
        addItemType(TYPE_LEVEL_0, R.layout.item_car_sj)
        addItemType(TYPE_LEVEL_1, R.layout.item_car_goods)
    }

    override fun convert(helper: BaseViewHolder, item: MultiItemEntity) {
        when (helper.itemViewType) {
            TYPE_LEVEL_0 -> {
                val carEntity = item as CarEntity
                helper.setText(R.id.sj_name, carEntity.name)
                helper.setChecked(R.id.check_goods, carEntity.isChecked)
                val check_good_sj = helper.getView<CheckBox>(R.id.check_goods)
                if (!isDEL) {
                    check_good_sj.isChecked = carEntity.isChecked
                } else {
                    check_good_sj.isChecked = carEntity.isDelChecked
                }
                checkSJITem(carEntity, check_good_sj)
                helper.itemView.setOnClickListener {
                    if (clickItem != null) {
                        clickItem!!.clickSJItem(helper.adapterPosition, carEntity)
                    }
                }
                val switch_button = helper.getView<SwitchButton>(R.id.switch_button)
                switch_button.setOnCheckedChangeListener { buttonView, isChecked ->
                    buttonView.setOnClickListener {
                        carEntity.isBjchecked = isChecked
                        for (subItem in carEntity.subItems) {
                            subItem.isBjchecked = isChecked
                        }
                        notifyDataSetChanged()
                    }
                }
                switch_button.isChecked = carEntity.isBjchecked
            }
            TYPE_LEVEL_1 -> {
                val goods = item as CarEntity.Goods
                val goods_img = helper.getView<ImageView>(R.id.goods_img)
                var goods_count = helper.getView<TextView>(R.id.goods_count)
                goods_count.text = "x${goods.goodscoun}"
                Glide.with(mContext).load(goods.urls).into(goods_img)
                helper.setText(R.id.goods_name, goods.goodsname)
                        .setText(R.id.goods_remake, goods.goodsremake)
                        .setText(R.id.goods_xprice, goods.goodsxprice.toString() + "")
                val goods_yprice = helper.getView<TextView>(R.id.goods_yprice)
                goods_yprice.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG //中划线
                goods_yprice.text = "￥" + goods.goodsyprice
                val check_goods = helper.getView<CheckBox>(R.id.check_goods)
                if (!isDEL) {
                    check_goods.isChecked = goods.isChecked
                } else {
                    check_goods.isChecked = goods.isDelChecked
                }
                checkGoodsItem(goods, check_goods)
                helper.itemView.setOnClickListener {
                    if (clickItem != null) {
                        clickItem!!.clickGoodsItem(helper.adapterPosition, goods)
                    }
                }
                val number_button = helper.getView<MyNumberButton>(R.id.number_button)
                if (goods.isBjchecked) {
                    helper.getView<TextView>(R.id.goods_count).visibility = View.INVISIBLE
                    number_button.visibility = View.VISIBLE
                    goods_yprice.visibility = View.GONE
                } else {
                    helper.getView<TextView>(R.id.goods_count).visibility = View.VISIBLE
                    number_button.visibility = View.GONE
                    goods_yprice.visibility = View.VISIBLE
                }
                number_button.setBuyMax(10)
                        .setInventory(1000)
                        .setCurrentNumber(goods.goodscoun)
                number_button.setOnChangeListener {
                    goods.goodscoun = number_button.number
                    goods_count.text = "x${goods.goodscoun}"
                    selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
                }
            }
        }
    }

    /**
     * 全选 反全选
     *
     * @param b 选择状态
     */
    fun CheckAll(b: Boolean) {
        for (multiItemEntity in data) {
            if (b) {
                if (multiItemEntity is CarEntity) {
                    //商家item状态
                    if (!isDEL) {
                        multiItemEntity.isChecked = true
                    } else {
                        multiItemEntity.isDelChecked = true
                    }
                } else {
                    //商品状态
                    if (!isDEL) {
                        (multiItemEntity as CarEntity.Goods).isChecked = true
                    } else {
                        (multiItemEntity as CarEntity.Goods).isDelChecked = true
                    }
                }
            } else {
                if (multiItemEntity is CarEntity) {
                    if (!isDEL) {
                        multiItemEntity.isChecked = false
                    } else {
                        multiItemEntity.isDelChecked = false
                    }
                } else {
                    if (!isDEL) {
                        (multiItemEntity as CarEntity.Goods).isChecked = false
                    } else {
                        (multiItemEntity as CarEntity.Goods).isDelChecked = false
                    }
                }
            }
        }
        notifyDataSetChanged()
        selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
    }

    /**
     * 点击商家的item给商家状态赋值，并给商家的商品赋值
     *
     * @param carEntity     单个商家
     * @param check_good_sj 商家checkbox
     */
    private fun checkSJITem(carEntity: CarEntity, check_good_sj: CheckBox) {
        check_good_sj.setOnCheckedChangeListener { compoundButton, isChecked ->
            compoundButton.setOnClickListener {
                if (!isDEL) {
                    carEntity.isChecked = isChecked
                } else {
                    carEntity.isDelChecked = isChecked
                }

                for (good in carEntity.subItems) {
                    if (!isDEL) {
                        good.isChecked = isChecked
                    } else {
                        good.isDelChecked = isChecked
                    }
                }
                notifyDataSetChanged()
                selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
            }
        }
    }

    /**
     * 点击商品的iteem给商品的状态赋值
     *
     * @param goods       单个商品
     * @param check_goods 商品checkbox
     */
    private fun checkGoodsItem(goods: CarEntity.Goods, check_goods: CheckBox) {
        check_goods.setOnCheckedChangeListener { compoundButton, isChecked ->

            compoundButton.setOnClickListener {
                if (!isDEL) {
                    goods.isChecked = isChecked
                } else {
                    goods.isDelChecked = isChecked
                }
                if (isChecked) {
                    isCheckAllGoods(goods.orgid)
                }
                if (!isChecked) {
                    isNOCheckAllGoods(goods.orgid)
                }
                notifyDataSetChanged()
                selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
            }
        }
    }

    /**
     * 判断是否全选商品
     */
    private fun isCheckAllGoods(orgid: Long) {
        for (datum in data) {
            if (datum is CarEntity) {
                if (orgid == datum.orgid) {
                    for (good in datum.subItems) {
                        if (!isDEL) {
                            if (!good.isChecked) {
                                return
                            }
                        } else {
                            if (!good.isDelChecked) {
                                return
                            }
                        }
                    }
                    if (!isDEL) {
                        datum.isChecked = true
                    } else {
                        datum.isDelChecked = true
                    }

                }
            }
        }
    }

    /**
     * 判断是否有一个未选商品
     */
    private fun isNOCheckAllGoods(orgid: Long) {
        for (datum in data) if (datum is CarEntity) {
            if (orgid == datum.orgid) {
                for (good in datum.subItems) {
                    if (!isDEL) {
                        if (!good.isChecked) {
                            datum.isChecked = false
                            return
                        }
                    } else {
                        if (!good.isDelChecked) {
                            datum.isDelChecked = false
                            return
                        }
                    }
                }
            }
        }
    }

    /**
     * 判断是否全选商家
     */
    private fun isCheckAllSJs(): Boolean {
        if (data.size == 0) {
            return false
        }
        if (!isDEL) {
            return data.none { it is CarEntity && !it.isChecked }
        } else {
            return data.none { it is CarEntity && !it.isDelChecked }
        }
    }

    /**
     *返回所有选中的 Goods Item
     */
    private fun getCheckItem(): ArrayList<CarEntity.Goods> {
        var goods = ArrayList<CarEntity.Goods>()
        if (!isDEL) {
            data.filterIsInstance<CarEntity.Goods>().filterTo(goods) { it.isChecked }
        } else {
            data.filterIsInstance<CarEntity.Goods>().filterTo(goods) { it.isDelChecked }
        }
        return goods
    }

    /**
     *删除选中的Item
     */
    fun removeChecked() {
        data
                .filterIsInstance<CarEntity>()
                .forEach {
                    if (it.isDelChecked) {
                        data.remove(it)
                        for (subItem in it.subItems) {
                            data.remove(subItem)
                        }
                    } else {
                        it.subItems.filter { it.isDelChecked }.forEach { data.remove(it) }
                    }
                }
        notifyDataSetChanged()
        selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
    }

    companion object {

        val TYPE_LEVEL_0 = 0
        val TYPE_LEVEL_1 = 1
    }

    interface ClickItem {
        fun clickSJItem(position: Int, carEntity: CarEntity)
        fun clickGoodsItem(position: Int, goods: CarEntity.Goods)
    }

    private var clickItem: ClickItem? = null
    fun setOnClickListener(clickItem: ClickItem) {
        this.clickItem = clickItem
    }

    fun delete(del: Boolean) {
        isDEL = del
        notifyDataSetChanged()
        selectChangeListener.goodsChangeS(getCheckItem(), isCheckAllSJs())
    }
}
