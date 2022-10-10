package com.example.shoppingmallrearend.commodity.entity;

import lombok.Data;

@Data
public class Commodity {
    private int id;
    // 商品标题
    private String commodityTitle;
    // 商品种类
    private int commodityCategory;
    // 商品最低价格
    private double commodityMiniPrice;
    // 商品最高价格
    private double commodityMaxPrice;
    // 商品审核状态
    private int commodityAuditStatus;
    // 商品销量
    private int commoditySalesVolume;
    // 商品详情标签
    private String commodityDetailsLabel;
    // 商品详情内容
    private String commodityDetailsContent;
    // 商品一级类型
    private int commodityLevelType;
    // 商品二级类型
    private int commoditySecondaryType;
    // 商品三级类型
    private int commodityTertiaryType;
}
