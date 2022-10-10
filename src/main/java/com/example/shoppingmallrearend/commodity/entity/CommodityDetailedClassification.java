package com.example.shoppingmallrearend.commodity.entity;

import lombok.Data;

// 商品
@Data
public class CommodityDetailedClassification {
    private int id;
    // 商品id
    private int commodityId;
    // 颜色分类
    private String screenRefreshRate;
    // 套餐类型
    private String packageType;
    // 硬盘容量
    private String hardDiskCapacity;
    // 内存容量
    private String memoryCapacity;
    // 尺码
    private String commoditySize;
    // 适用床尺寸
    private String applicableBedSize;
    // 净含量
    private String netContent;
    // 香味
    private String aroma;
    // 香调
    private String fragrance;
    // 适合肤质
    private String suitableForSkinType;
    // 口味
    private String flavor;
    // 安装类型
    private String installationType;
    // 价格
    private double commodityPrice;
}
