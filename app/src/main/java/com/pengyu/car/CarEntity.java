package com.pengyu.car;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by PengYu on 2017/10/18.
 */

public class CarEntity extends AbstractExpandableItem<CarEntity.Goods> implements MultiItemEntity {
    private String name;                //商家名称
    private long orgid;                 //商家ID
    private YH yh;                       //商家的商品优惠
    private boolean checked;
    private boolean scchecked;
    private boolean bjchecked;
    private boolean delChecked;

    public boolean isDelChecked() {
        return delChecked;
    }

    public void setDelChecked(boolean delChecked) {
        this.delChecked = delChecked;
    }

    public boolean isBjchecked() {
        return bjchecked;
    }

    public void setBjchecked(boolean bjchecked) {
        this.bjchecked = bjchecked;
    }

    public boolean isSjchecked() {
        return sjchecked;
    }

    public void setSjchecked(boolean sjchecked) {
        this.sjchecked = sjchecked;
    }

    private boolean sjchecked;

    public boolean isScchecked() {
        return scchecked;
    }

    public void setScchecked(boolean scchecked) {
        this.scchecked = scchecked;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrgid() {
        return orgid;
    }

    public void setOrgid(long orgid) {
        this.orgid = orgid;
    }

    public YH getYh() {
        return yh;
    }

    public void setYh(YH yh) {
        this.yh = yh;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getItemType() {
        return CarAdapter.Companion.getTYPE_LEVEL_0();
    }

    static class YH {
        private long yhid;              //优惠ID
        private String yhremake;        //优惠描述
        private String yhlable;         //优惠标签
        private double yhprice;         //优惠价格
        private int yhaway;             //优惠的方式（满减==0（满减需要商品的总额-满送金额）、满送==1（满送不用管）、瞒包=2满多少包邮（不需要支付邮费））

        public long getYhid() {
            return yhid;
        }

        public void setYhid(long yhid) {
            this.yhid = yhid;
        }

        public String getYhremake() {
            return yhremake;
        }

        public void setYhremake(String yhremake) {
            this.yhremake = yhremake;
        }

        public String getYhlable() {
            return yhlable;
        }

        public void setYhlable(String yhlable) {
            this.yhlable = yhlable;
        }

        public double getYhprice() {
            return yhprice;
        }

        public void setYhprice(double yhprice) {
            this.yhprice = yhprice;
        }

        public int getYhaway() {
            return yhaway;
        }

        public void setYhaway(int yhaway) {
            this.yhaway = yhaway;
        }
    }

    public static class Goods implements MultiItemEntity {
        private long orgid;             //商家ID
        private long goodsid;           //商品ID
        private String goodsname;       //商品名称
        private double goodsyprice;     //商品原价格
        private double goodsxprice;     //商品现价格
        private int goodscoun;          //商品数量
        private String goodsremake;     //商品描述
        private boolean goodsisby;      //商品是否包邮
        private double goodsyf;         //商品邮费
        private String urls;      //商品图片
        private boolean checked;
        private boolean bjchecked;
        private boolean delChecked;

        public boolean isDelChecked() {
            return delChecked;
        }

        public void setDelChecked(boolean delChecked) {
            this.delChecked = delChecked;
        }

        public boolean isBjchecked() {
            return bjchecked;
        }

        public void setBjchecked(boolean bjchecked) {
            this.bjchecked = bjchecked;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        public long getOrgid() {
            return orgid;
        }

        public void setOrgid(long orgid) {
            this.orgid = orgid;
        }

        public long getGoodsid() {
            return goodsid;
        }

        public void setGoodsid(long goodsid) {
            this.goodsid = goodsid;
        }

        public String getGoodsname() {
            return goodsname;
        }

        public void setGoodsname(String goodsname) {
            this.goodsname = goodsname;
        }

        public double getGoodsyprice() {
            return goodsyprice;
        }

        public void setGoodsyprice(double goodsyprice) {
            this.goodsyprice = goodsyprice;
        }

        public double getGoodsxprice() {
            return goodsxprice;
        }

        public void setGoodsxprice(double goodsxprice) {
            this.goodsxprice = goodsxprice;
        }

        public int getGoodscoun() {
            return goodscoun;
        }

        public void setGoodscoun(int goodscoun) {
            this.goodscoun = goodscoun;
        }

        public String getGoodsremake() {
            return goodsremake;
        }

        public void setGoodsremake(String goodsremake) {
            this.goodsremake = goodsremake;
        }

        public boolean isGoodsisby() {
            return goodsisby;
        }

        public void setGoodsisby(boolean goodsisby) {
            this.goodsisby = goodsisby;
        }

        public double getGoodsyf() {
            return goodsyf;
        }

        public void setGoodsyf(double goodsyf) {
            this.goodsyf = goodsyf;
        }

        public String getUrls() {
            return urls;
        }

        public void setUrls(String urls) {
            this.urls = urls;
        }

        @Override
        public int getItemType() {
            return CarAdapter.Companion.getTYPE_LEVEL_1();
        }
    }
}
