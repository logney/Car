package com.pengyu.car

import com.chad.library.adapter.base.entity.MultiItemEntity

import java.util.ArrayList

/**
 * Created by PengYu on 2017/10/18.
 */

object CreateData {


    fun createSJ(): ArrayList<MultiItemEntity> {
        val res = ArrayList<MultiItemEntity>()
        val carEntity0 = CarEntity()
        for (goods in createSJGoods0()) {
            carEntity0.addSubItem(goods)
        }
        carEntity0.yh = createSJYH()[0]
        carEntity0.name = "湖南刀削面"
        carEntity0.orgid = 0

        val carEntity1 = CarEntity()
        for (goods in createSJGoods1()) {
            carEntity1.addSubItem(goods)
        }
        carEntity1.yh = createSJYH()[1]
        carEntity1.name = "山西肠旺面"
        carEntity1.orgid = 1

        val carEntity2 = CarEntity()
        for (goods in createSJGoods2()) {
            carEntity2.addSubItem(goods)
        }
        carEntity2.yh = createSJYH()[2]
        carEntity2.name = "遵义虾子牛肉粉"
        carEntity2.orgid = 2

        res.add(carEntity0)
        res.add(carEntity1)
        res.add(carEntity2)
        return res
    }

    fun createSJGoods0(): List<CarEntity.Goods> {
        val goods = ArrayList<CarEntity.Goods>()
        val good0 = CarEntity.Goods()
        good0.orgid = 0
        good0.goodsid = 0
        good0.goodscoun = 1
        good0.isGoodsisby = false
        good0.goodsyf = 10.0
        good0.goodsname = "原味刀削面"
        good0.goodsremake = "原滋原味，正宗湖面刀削面！"
        good0.goodsxprice = 88.0
        good0.goodsyprice = 99.0
        good0.urls = createDXPic()[0]

        val good1 = CarEntity.Goods()
        good1.orgid = 0
        good1.goodsid = 1
        good1.goodscoun = 2
        good1.isGoodsisby = false
        good1.goodsyf = 20.0
        good1.goodsname = "番茄刀削面"
        good1.goodsremake = "这酸爽、才正宗！"
        good1.goodsxprice = 109.0
        good1.goodsyprice = 128.0
        good1.urls = createDXPic()[1]

        val good2 = CarEntity.Goods()
        good2.orgid = 0
        good2.goodsid = 2
        good2.goodscoun = 3
        good2.isGoodsisby = true
        good2.goodsyf = 0.0
        good2.goodsname = "糖醋排骨刀削面"
        good2.goodsremake = "你没有吃过的味道、都在这里面！"
        good2.goodsxprice = 188.0
        good2.goodsyprice = 199.0
        good2.urls = createDXPic()[2]

        val good3 = CarEntity.Goods()
        good3.orgid = 0
        good3.goodsid = 3
        good3.goodscoun = 4
        good3.isGoodsisby = false
        good3.goodsyf = 10.0
        good3.goodsname = "原味刀削面"
        good3.goodsremake = "原滋原味，正宗湖面刀削面！"
        good3.goodsxprice = 88.0
        good3.goodsyprice = 99.0
        good3.urls = createDXPic()[0]

        val good4 = CarEntity.Goods()
        good4.orgid = 0
        good4.goodsid = 4
        good4.goodscoun = 5
        good4.isGoodsisby = false
        good4.goodsyf = 20.0
        good4.goodsname = "番茄刀削面"
        good4.goodsremake = "这酸爽、才正宗！"
        good4.goodsxprice = 109.0
        good4.goodsyprice = 128.0
        good4.urls = createDXPic()[1]

        val good5 = CarEntity.Goods()
        good5.orgid = 0
        good5.goodsid = 5
        good5.goodscoun = 6
        good5.isGoodsisby = true
        good5.goodsyf = 0.0
        good5.goodsname = "糖醋排骨刀削面"
        good5.goodsremake = "你没有吃过的味道、都在这里面！"
        good5.goodsxprice = 188.0
        good5.goodsyprice = 199.0
        good5.urls = createDXPic()[2]

        goods.add(good0)
        goods.add(good1)
        goods.add(good2)
        goods.add(good3)
        goods.add(good4)
        goods.add(good5)
        return goods
    }

    fun createSJGoods1(): List<CarEntity.Goods> {
        val goods = ArrayList<CarEntity.Goods>()
        val good0 = CarEntity.Goods()
        good0.orgid = 1
        good0.goodsid = 0
        good0.goodscoun = 1
        good0.isGoodsisby = false
        good0.goodsyf = 10.0
        good0.goodsname = "青椒肠旺面"
        good0.goodsremake = "青椒麻辣肠旺！"
        good0.goodsxprice = 26.0
        good0.goodsyprice = 32.0
        good0.urls = createCWPic()[0]

        val good1 = CarEntity.Goods()
        good1.orgid = 1
        good1.goodsid = 1
        good1.goodscoun = 2
        good1.isGoodsisby = false
        good1.goodsyf = 10.0
        good1.goodsname = "肉末肠旺面"
        good1.goodsremake = "你没有吃过的未到哦！"
        good1.goodsxprice = 56.0
        good1.goodsyprice = 48.0
        good1.urls = createCWPic()[1]

        val good2 = CarEntity.Goods()
        good2.orgid = 1
        good2.goodsid = 2
        good2.goodscoun = 3
        good2.isGoodsisby = true
        good2.goodsyf = 0.0
        good2.goodsname = "原味刀削面"
        good2.goodsremake = "还不快啦歹两口！"
        good2.goodsxprice = 88.0
        good2.goodsyprice = 128.0
        good2.urls = createCWPic()[2]

        goods.add(good0)
        goods.add(good1)
        goods.add(good2)
        return goods
    }

    fun createSJGoods2(): List<CarEntity.Goods> {
        val goods = ArrayList<CarEntity.Goods>()
        val good0 = CarEntity.Goods()
        good0.orgid = 2
        good0.goodsid = 0
        good0.goodscoun = 1
        good0.isGoodsisby = false
        good0.goodsyf = 10.0
        good0.goodsname = "原味遵义虾子牛肉粉"
        good0.goodsremake = "原滋原味，正宗遵义虾子牛肉粉！"
        good0.goodsxprice = 88.0
        good0.goodsyprice = 99.0
        good0.urls = createXZPic()[0]

        val good1 = CarEntity.Goods()
        good1.orgid = 2
        good1.goodsid = 1
        good1.goodscoun = 2
        good1.isGoodsisby = false
        good1.goodsyf = 10.0
        good1.goodsname = "麻辣遵义虾子牛肉粉"
        good1.goodsremake = "吐火不要怪我，正宗遵义虾子牛肉粉！"
        good1.goodsxprice = 88.0
        good1.goodsyprice = 99.0
        good1.urls = createXZPic()[1]

        val good2 = CarEntity.Goods()
        good2.orgid = 2
        good2.goodsid = 2
        good2.goodscoun = 3
        good2.isGoodsisby = false
        good2.goodsyf = 10.0
        good2.goodsname = "清汤遵义虾子牛肉粉"
        good2.goodsremake = "安逸、正宗遵义虾子牛肉粉！"
        good2.goodsxprice = 88.0
        good2.goodsyprice = 99.0
        good2.urls = createXZPic()[2]

        val good3 = CarEntity.Goods()
        good3.orgid = 2
        good3.goodsid = 3
        good3.goodscoun = 4
        good3.isGoodsisby = false
        good3.goodsyf = 10.0
        good3.goodsname = "原味遵义虾子牛肉粉"
        good3.goodsremake = "原滋原味，正宗遵义虾子牛肉粉！"
        good3.goodsxprice = 88.0
        good3.goodsyprice = 99.0
        good3.urls = createXZPic()[0]

        val good4 = CarEntity.Goods()
        good4.orgid = 2
        good4.goodsid = 4
        good4.goodscoun = 5
        good4.isGoodsisby = false
        good4.goodsyf = 10.0
        good4.goodsname = "麻辣遵义虾子牛肉粉"
        good4.goodsremake = "吐火不要怪我，正宗遵义虾子牛肉粉！"
        good4.goodsxprice = 88.0
        good4.goodsyprice = 99.0
        good4.urls = createXZPic()[1]

        val good5 = CarEntity.Goods()
        good5.orgid = 2
        good5.goodsid = 5
        good5.goodscoun = 6
        good5.isGoodsisby = false
        good5.goodsyf = 10.0
        good5.goodsname = "麻辣遵义虾子牛肉粉"
        good5.goodsremake = "吐火不要怪我，正宗遵义虾子牛肉粉！"
        good5.goodsxprice = 88.0
        good5.goodsyprice = 99.0
        good5.urls = createXZPic()[1]


        val good6 = CarEntity.Goods()
        good6.orgid = 2
        good6.goodsid = 6
        good6.goodscoun = 7
        good6.isGoodsisby = false
        good6.goodsyf = 10.0
        good6.goodsname = "清汤遵义虾子牛肉粉"
        good6.goodsremake = "安逸、正宗遵义虾子牛肉粉！"
        good6.goodsxprice = 88.0
        good6.goodsyprice = 99.0
        good6.urls = createXZPic()[2]

        goods.add(good0)
        goods.add(good1)
        goods.add(good2)
        goods.add(good3)
        goods.add(good4)
        goods.add(good5)
        goods.add(good6)
        return goods
    }

    fun createSJYH(): List<CarEntity.YH> {
        val yhs = ArrayList<CarEntity.YH>()
        val yh0 = CarEntity.YH()
        yh0.yhaway = 0
        yh0.yhid = 0
        yh0.yhlable = "满减100减20"
        yh0.yhremake = "满减100减20"
        yh0.yhprice = 20.0

        val yh1 = CarEntity.YH()
        yh1.yhaway = 1
        yh1.yhid = 0
        yh1.yhlable = "满减3件送一件"
        yh1.yhremake = "满减3件送一件"
        yh1.yhprice = 0.0

        val yh2 = CarEntity.YH()
        yh2.yhaway = 2
        yh2.yhid = 0
        yh2.yhlable = "满减100免运费"
        yh2.yhremake = "满减100免运费"
        yh2.yhprice = 20.0

        yhs.add(yh0)
        yhs.add(yh1)
        yhs.add(yh2)
        return yhs
    }

    fun createDXPic(): List<String> {
        val urls = ArrayList<String>()
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824476&di=b79f0852fdde24282f65fcdbf515a40b&imgtype=0&src=http%3A%2F%2Fimages.3158.cn%2Fdata%2Fattachment%2Fhenan%2Farticle%2F2015%2F10%2F14%2F518b1ec4ff77d5ab9360bc655417e12d.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824473&di=35053b77bfa578a8a8bf7c2787af8314&imgtype=0&src=http%3A%2F%2Fimg0.114pifa.com%2Fg%2Fimg%2Fibank%2F2014%2F762%2F851%2F1403158267_1658767953.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824472&di=07d9b011af345b26a505b1c2a57ce795&imgtype=0&src=http%3A%2F%2Fpic34.photophoto.cn%2F20150209%2F0042040239972646_b.jpg")
        return urls
    }

    fun createCWPic(): List<String> {
        val urls = ArrayList<String>()
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950580&di=d11ec4ccdc7561d5109b87314e76a84f&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D1596239398%2C1986604453%26fm%3D214%26gp%3D0.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950099&di=8f7ba005a74b595d7c1ba5878df6aa6f&imgtype=0&src=http%3A%2F%2Fpic30.photophoto.cn%2F20140108%2F0042040756019397_b.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950163&di=001150269aa3a16e50dccb35d7a80f46&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F07%2F62%2F01300000246140122405627526115.jpg")
        return urls
    }

    fun createXZPic(): List<String> {
        val urls = ArrayList<String>()
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508908768&di=9d62ef03fedd4ba614b80a6719cdec8b&imgtype=jpg&er=1&src=http%3A%2F%2Fpic20.nipic.com%2F20120409%2F9248108_182754356100_2.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508314049132&di=1370440ec03ae5531f42ededdc57dd4a&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F22%2F89%2F54%2F57e4b4e97d944_1024.jpg")
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508314049125&di=0a60acc39f6ba8ffbf51e18b3f3c325b&imgtype=0&src=http%3A%2F%2Fpic.35pic.com%2Fnormal%2F00%2F00%2F00%2F2673288_090656861626_2.jpg")
        return urls
    }

}
