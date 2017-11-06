package com.pengyu.car

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.chad.library.adapter.base.entity.MultiItemEntity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbarc.*

/**
 * Created by PengYu on 2017/10/18.
 */

class MainActivity : BaseActivity() {

    private var carAdapter: CarAdapter? = null
    private var allPrice: Float = 0.0f
    private var goods_xprice: TextView? = null
    private var checkItems: ArrayList<CarEntity.Goods> = ArrayList()
    private var delCheckItems: ArrayList<CarEntity.Goods> = ArrayList()
    private var createSJ: ArrayList<MultiItemEntity>? = null
    private var context: Context = this
    private var isDel = false

    override fun setLayoutId(): Int {
        isImmersionBarEnabled = true
        return R.layout.activity_main
    }

    override fun initView() {
        goods_xprice = findViewById(R.id.goods_xprice) as TextView
        car_recy.layoutManager = LinearLayoutManager(this)
        createSJ = CreateData.createSJ()
        bar_title.text = resources.getString(R.string.gwc)

        carAdapter = CarAdapter(createSJ!!, object : SelectChangeListener {
            override fun goodsChangeS(checkItem: ArrayList<CarEntity.Goods>, checkAllSJs: Boolean) {
                check_goods_all.isChecked = checkAllSJs
                //如果是删除商品状态这不需要计算操作
                if (isDel) {
                    delCheckItems = checkItem
                    fkmd.setCenterString("删除(${delCheckItems!!.size})")
                    return
                }
                checkItems = checkItem
                allPrice = 0.0f
                for (goods in checkItem) {
                    allPrice += goods.goodsxprice.toFloat() * goods.goodscoun
                }
                fkmd.setCenterString("结算(${checkItem.size})")
                goods_xprice!!.setText("${allPrice}")
            }

        })
        car_recy.adapter = carAdapter

        //展开商家下面的Item
        carAdapter!!.expandAll()

        //全选或反选监听
        check_goods_all.setOnCheckedChangeListener { compoundButton, isChecked ->
            compoundButton.setOnClickListener {
                carAdapter!!.CheckAll(isChecked)
            }
        }

        //删除或支付
        fkmd.setOnClickListener {
            if (isDel) {
                carAdapter!!.removeChecked()
            } else {
                Toast.makeText(context, "共支付：${goods_xprice!!.text}元", Toast.LENGTH_LONG).show()
            }
        }

        //Item点击事件监听
        carAdapter!!.setOnClickListener(object : CarAdapter.ClickItem {
            override fun clickSJItem(position: Int, carEntity: CarEntity) {
                Toast.makeText(context, "商家：${carEntity.name}", Toast.LENGTH_SHORT).show()
            }

            override fun clickGoodsItem(position: Int, goods: CarEntity.Goods) {
                Toast.makeText(context, "商品：${goods.goodsname}", Toast.LENGTH_SHORT).show()
            }

        })

        //管理商品事件监听
        goods_gl.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                isDel = true
                money_root.visibility = View.INVISIBLE
                fkmd.setCenterString("删除(${delCheckItems!!.size})")
                carAdapter!!.delete(isDel)
            } else {
                isDel = false
                money_root.visibility = View.VISIBLE
                fkmd.setCenterString("结算(${checkItems!!.size})")
                carAdapter!!.delete(isDel)
            }
        }
    }

    override fun initData() {
    }
}
