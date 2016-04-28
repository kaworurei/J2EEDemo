package com.j2eedemo.vo;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/4/28.
 */
@Entity
@Table(name = "Shop", schema = "", catalog = "")
public class ShopVO {
    private int id;
    private String shopName;
    private String shopAddress;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ShopName")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "ShopAddress")
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopVO shopVO = (ShopVO) o;

        if (id != shopVO.id) return false;
        if (shopName != null ? !shopName.equals(shopVO.shopName) : shopVO.shopName != null) return false;
        return shopAddress != null ? shopAddress.equals(shopVO.shopAddress) : shopVO.shopAddress == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (shopAddress != null ? shopAddress.hashCode() : 0);
        return result;
    }
}
