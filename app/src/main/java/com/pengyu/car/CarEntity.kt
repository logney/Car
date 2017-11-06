package com.pengyu.car

import com.chad.library.adapter.base.entity.AbstractExpandableItem
import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * Created by PengYu on 2017/10/18.
 */

class CarEntity : AbstractExpandableItem<CarEntity.Goods>(), MultiItemEntity {
    var name: String? = null                //商家名称
    var orgid: Long = 0                 //商家ID
    var yh: YH? = null                       //商家的商品优惠
    var isChecked: Boolean = false
    var isScchecked: Boolean = false
    var isBjchecked: Boolean = false
    var isDelChecked: Boolean = false

    var isSjchecked: Boolean = false

    override fun getLevel(): Int {
        return 0
    }

    override fun getItemType(): Int {
        return CarAdapter.TYPE_LEVEL_0
    }

    class YH {
        var yhid: Long = 0              //优惠ID
        var yhremake: String? = null        //优惠描述
        var yhlable: String? = null         //优惠标签
        var yhprice: Double = 0.toDouble()         //优惠价格
        var yhaway: Int = 0             //优惠的方式（满减==0（满减需要商品的总额-满送金额）、满送==1（满送不用管）、瞒包=2满多少包邮（不需要支付邮费））
    }

    class Goods : MultiItemEntity {
        var orgid: Long = 0             //商家ID
        var goodsid: Long = 0           //商品ID
        var goodsname: String? = null       //商品名称
        var goodsyprice: Double = 0.toDouble()     //商品原价格
        var goodsxprice: Double = 0.toDouble()     //商品现价格
        var goodscoun: Int = 0          //商品数量
        var goodsremake: String? = null     //商品描述
        var isGoodsisby: Boolean = false      //商品是否包邮
        var goodsyf: Double = 0.toDouble()         //商品邮费
        var urls: String? = null      //商品图片
        var isChecked: Boolean = false
        var isBjchecked: Boolean = false
        var isDelChecked: Boolean = false

        override fun getItemType(): Int {
            return CarAdapter.TYPE_LEVEL_1
        }
    }
}
