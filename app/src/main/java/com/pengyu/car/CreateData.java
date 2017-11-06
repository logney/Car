package com.pengyu.car;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PengYu on 2017/10/18.
 */

public class CreateData {


    public static ArrayList<MultiItemEntity> createSJ() {
        ArrayList<MultiItemEntity> res = new ArrayList<>();
        CarEntity carEntity0 = new CarEntity();
        for (CarEntity.Goods goods : createSJGoods0()) {
            carEntity0.addSubItem(goods);
        }
        carEntity0.setYh(createSJYH().get(0));
        carEntity0.setName("湖南刀削面");
        carEntity0.setOrgid(0);

        CarEntity carEntity1 = new CarEntity();
        for (CarEntity.Goods goods : createSJGoods1()) {
            carEntity1.addSubItem(goods);
        }
        carEntity1.setYh(createSJYH().get(1));
        carEntity1.setName("山西肠旺面");
        carEntity1.setOrgid(1);

        CarEntity carEntity2 = new CarEntity();
        for (CarEntity.Goods goods : createSJGoods2()) {
            carEntity2.addSubItem(goods);
        }
        carEntity2.setYh(createSJYH().get(2));
        carEntity2.setName("遵义虾子牛肉粉");
        carEntity2.setOrgid(2);

        res.add(carEntity0);
        res.add(carEntity1);
        res.add(carEntity2);
        return res;
    }

    public static List<CarEntity.Goods> createSJGoods0() {
        List<CarEntity.Goods> goods = new ArrayList<>();
        CarEntity.Goods good0 = new CarEntity.Goods();
        good0.setOrgid(0);
        good0.setGoodsid(0);
        good0.setGoodscoun(1);
        good0.setGoodsisby(false);
        good0.setGoodsyf(10);
        good0.setGoodsname("原味刀削面");
        good0.setGoodsremake("原滋原味，正宗湖面刀削面！");
        good0.setGoodsxprice(88);
        good0.setGoodsyprice(99);
        good0.setUrls(createDXPic().get(0));

        CarEntity.Goods good1 = new CarEntity.Goods();
        good1.setOrgid(0);
        good1.setGoodsid(1);
        good1.setGoodscoun(2);
        good1.setGoodsisby(false);
        good1.setGoodsyf(20);
        good1.setGoodsname("番茄刀削面");
        good1.setGoodsremake("这酸爽、才正宗！");
        good1.setGoodsxprice(109);
        good1.setGoodsyprice(128);
        good1.setUrls(createDXPic().get(1));

        CarEntity.Goods good2 = new CarEntity.Goods();
        good2.setOrgid(0);
        good2.setGoodsid(2);
        good2.setGoodscoun(3);
        good2.setGoodsisby(true);
        good2.setGoodsyf(0);
        good2.setGoodsname("糖醋排骨刀削面");
        good2.setGoodsremake("你没有吃过的味道、都在这里面！");
        good2.setGoodsxprice(188);
        good2.setGoodsyprice(199);
        good2.setUrls(createDXPic().get(2));

        CarEntity.Goods good3 = new CarEntity.Goods();
        good3.setOrgid(0);
        good3.setGoodsid(3);
        good3.setGoodscoun(4);
        good3.setGoodsisby(false);
        good3.setGoodsyf(10);
        good3.setGoodsname("原味刀削面");
        good3.setGoodsremake("原滋原味，正宗湖面刀削面！");
        good3.setGoodsxprice(88);
        good3.setGoodsyprice(99);
        good3.setUrls(createDXPic().get(0));

        CarEntity.Goods good4 = new CarEntity.Goods();
        good4.setOrgid(0);
        good4.setGoodsid(4);
        good4.setGoodscoun(5);
        good4.setGoodsisby(false);
        good4.setGoodsyf(20);
        good4.setGoodsname("番茄刀削面");
        good4.setGoodsremake("这酸爽、才正宗！");
        good4.setGoodsxprice(109);
        good4.setGoodsyprice(128);
        good4.setUrls(createDXPic().get(1));

        CarEntity.Goods good5 = new CarEntity.Goods();
        good5.setOrgid(0);
        good5.setGoodsid(5);
        good5.setGoodscoun(6);
        good5.setGoodsisby(true);
        good5.setGoodsyf(0);
        good5.setGoodsname("糖醋排骨刀削面");
        good5.setGoodsremake("你没有吃过的味道、都在这里面！");
        good5.setGoodsxprice(188);
        good5.setGoodsyprice(199);
        good5.setUrls(createDXPic().get(2));

        goods.add(good0);
        goods.add(good1);
        goods.add(good2);
        goods.add(good3);
        goods.add(good4);
        goods.add(good5);
        return goods;
    }

    public static List<CarEntity.Goods> createSJGoods1() {
        List<CarEntity.Goods> goods = new ArrayList<>();
        CarEntity.Goods good0 = new CarEntity.Goods();
        good0.setOrgid(1);
        good0.setGoodsid(0);
        good0.setGoodscoun(1);
        good0.setGoodsisby(false);
        good0.setGoodsyf(10);
        good0.setGoodsname("青椒肠旺面");
        good0.setGoodsremake("青椒麻辣肠旺！");
        good0.setGoodsxprice(26);
        good0.setGoodsyprice(32);
        good0.setUrls(createCWPic().get(0));

        CarEntity.Goods good1 = new CarEntity.Goods();
        good1.setOrgid(1);
        good1.setGoodsid(1);
        good1.setGoodscoun(2);
        good1.setGoodsisby(false);
        good1.setGoodsyf(10);
        good1.setGoodsname("肉末肠旺面");
        good1.setGoodsremake("你没有吃过的未到哦！");
        good1.setGoodsxprice(56);
        good1.setGoodsyprice(48);
        good1.setUrls(createCWPic().get(1));

        CarEntity.Goods good2 = new CarEntity.Goods();
        good2.setOrgid(1);
        good2.setGoodsid(2);
        good2.setGoodscoun(3);
        good2.setGoodsisby(true);
        good2.setGoodsyf(0);
        good2.setGoodsname("原味刀削面");
        good2.setGoodsremake("还不快啦歹两口！");
        good2.setGoodsxprice(88);
        good2.setGoodsyprice(128);
        good2.setUrls(createCWPic().get(2));

        goods.add(good0);
        goods.add(good1);
        goods.add(good2);
        return goods;
    }

    public static List<CarEntity.Goods> createSJGoods2() {
        List<CarEntity.Goods> goods = new ArrayList<>();
        CarEntity.Goods good0 = new CarEntity.Goods();
        good0.setOrgid(2);
        good0.setGoodsid(0);
        good0.setGoodscoun(1);
        good0.setGoodsisby(false);
        good0.setGoodsyf(10);
        good0.setGoodsname("原味遵义虾子牛肉粉");
        good0.setGoodsremake("原滋原味，正宗遵义虾子牛肉粉！");
        good0.setGoodsxprice(88);
        good0.setGoodsyprice(99);
        good0.setUrls(createXZPic().get(0));

        CarEntity.Goods good1 = new CarEntity.Goods();
        good1.setOrgid(2);
        good1.setGoodsid(1);
        good1.setGoodscoun(2);
        good1.setGoodsisby(false);
        good1.setGoodsyf(10);
        good1.setGoodsname("麻辣遵义虾子牛肉粉");
        good1.setGoodsremake("吐火不要怪我，正宗遵义虾子牛肉粉！");
        good1.setGoodsxprice(88);
        good1.setGoodsyprice(99);
        good1.setUrls(createXZPic().get(1));

        CarEntity.Goods good2 = new CarEntity.Goods();
        good2.setOrgid(2);
        good2.setGoodsid(2);
        good2.setGoodscoun(3);
        good2.setGoodsisby(false);
        good2.setGoodsyf(10);
        good2.setGoodsname("清汤遵义虾子牛肉粉");
        good2.setGoodsremake("安逸、正宗遵义虾子牛肉粉！");
        good2.setGoodsxprice(88);
        good2.setGoodsyprice(99);
        good2.setUrls(createXZPic().get(2));

        CarEntity.Goods good3 = new CarEntity.Goods();
        good3.setOrgid(2);
        good3.setGoodsid(3);
        good3.setGoodscoun(4);
        good3.setGoodsisby(false);
        good3.setGoodsyf(10);
        good3.setGoodsname("原味遵义虾子牛肉粉");
        good3.setGoodsremake("原滋原味，正宗遵义虾子牛肉粉！");
        good3.setGoodsxprice(88);
        good3.setGoodsyprice(99);
        good3.setUrls(createXZPic().get(0));

        CarEntity.Goods good4 = new CarEntity.Goods();
        good4.setOrgid(2);
        good4.setGoodsid(4);
        good4.setGoodscoun(5);
        good4.setGoodsisby(false);
        good4.setGoodsyf(10);
        good4.setGoodsname("麻辣遵义虾子牛肉粉");
        good4.setGoodsremake("吐火不要怪我，正宗遵义虾子牛肉粉！");
        good4.setGoodsxprice(88);
        good4.setGoodsyprice(99);
        good4.setUrls(createXZPic().get(1));

        CarEntity.Goods good5 = new CarEntity.Goods();
        good5.setOrgid(2);
        good5.setGoodsid(5);
        good5.setGoodscoun(6);
        good5.setGoodsisby(false);
        good5.setGoodsyf(10);
        good5.setGoodsname("麻辣遵义虾子牛肉粉");
        good5.setGoodsremake("吐火不要怪我，正宗遵义虾子牛肉粉！");
        good5.setGoodsxprice(88);
        good5.setGoodsyprice(99);
        good5.setUrls(createXZPic().get(1));


        CarEntity.Goods good6 = new CarEntity.Goods();
        good6.setOrgid(2);
        good6.setGoodsid(6);
        good6.setGoodscoun(7);
        good6.setGoodsisby(false);
        good6.setGoodsyf(10);
        good6.setGoodsname("清汤遵义虾子牛肉粉");
        good6.setGoodsremake("安逸、正宗遵义虾子牛肉粉！");
        good6.setGoodsxprice(88);
        good6.setGoodsyprice(99);
        good6.setUrls(createXZPic().get(2));

        goods.add(good0);
        goods.add(good1);
        goods.add(good2);
        goods.add(good3);
        goods.add(good4);
        goods.add(good5);
        goods.add(good6);
        return goods;
    }

    public static List<CarEntity.YH> createSJYH() {
        List<CarEntity.YH> yhs = new ArrayList<>();
        CarEntity.YH yh0 = new CarEntity.YH();
        yh0.setYhaway(0);
        yh0.setYhid(0);
        yh0.setYhlable("满减100减20");
        yh0.setYhremake("满减100减20");
        yh0.setYhprice(20);

        CarEntity.YH yh1 = new CarEntity.YH();
        yh1.setYhaway(1);
        yh1.setYhid(0);
        yh1.setYhlable("满减3件送一件");
        yh1.setYhremake("满减3件送一件");
        yh1.setYhprice(0);

        CarEntity.YH yh2 = new CarEntity.YH();
        yh2.setYhaway(2);
        yh2.setYhid(0);
        yh2.setYhlable("满减100免运费");
        yh2.setYhremake("满减100免运费");
        yh2.setYhprice(20);

        yhs.add(yh0);
        yhs.add(yh1);
        yhs.add(yh2);
        return yhs;
    }

    public static List<String> createDXPic() {
        List<String> urls = new ArrayList<>();
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824476&di=b79f0852fdde24282f65fcdbf515a40b&imgtype=0&src=http%3A%2F%2Fimages.3158.cn%2Fdata%2Fattachment%2Fhenan%2Farticle%2F2015%2F10%2F14%2F518b1ec4ff77d5ab9360bc655417e12d.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824473&di=35053b77bfa578a8a8bf7c2787af8314&imgtype=0&src=http%3A%2F%2Fimg0.114pifa.com%2Fg%2Fimg%2Fibank%2F2014%2F762%2F851%2F1403158267_1658767953.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313824472&di=07d9b011af345b26a505b1c2a57ce795&imgtype=0&src=http%3A%2F%2Fpic34.photophoto.cn%2F20150209%2F0042040239972646_b.jpg");
        return urls;
    }

    public static List<String> createCWPic() {
        List<String> urls = new ArrayList<>();
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950580&di=d11ec4ccdc7561d5109b87314e76a84f&imgtype=jpg&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D1596239398%2C1986604453%26fm%3D214%26gp%3D0.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950099&di=8f7ba005a74b595d7c1ba5878df6aa6f&imgtype=0&src=http%3A%2F%2Fpic30.photophoto.cn%2F20140108%2F0042040756019397_b.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508313950163&di=001150269aa3a16e50dccb35d7a80f46&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F07%2F62%2F01300000246140122405627526115.jpg");
        return urls;
    }

    public static List<String> createXZPic() {
        List<String> urls = new ArrayList<>();
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508908768&di=9d62ef03fedd4ba614b80a6719cdec8b&imgtype=jpg&er=1&src=http%3A%2F%2Fpic20.nipic.com%2F20120409%2F9248108_182754356100_2.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508314049132&di=1370440ec03ae5531f42ededdc57dd4a&imgtype=0&src=http%3A%2F%2Fpic.qiantucdn.com%2F58pic%2F22%2F89%2F54%2F57e4b4e97d944_1024.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508314049125&di=0a60acc39f6ba8ffbf51e18b3f3c325b&imgtype=0&src=http%3A%2F%2Fpic.35pic.com%2Fnormal%2F00%2F00%2F00%2F2673288_090656861626_2.jpg");
        return urls;
    }

}
