package com.inventrax.karthikm.merlinwmscipher_vip_rdc.model;

/**
 * Created by karthik.m on 06/25/2018.
 */

public class MaterialInfo {
    public String Mcode;
    public double Qty;
    public String Location;
    public String SuggestionId;
    public String TenantID;
    public String WareHouseID;

    public String getSuggestionId() {
        return SuggestionId;
    }

    public void setSuggestionId(String suggestionId) {
        SuggestionId = suggestionId;
    }

    public String getMcode() {
        return Mcode;
    }

    public void setMcode(String mcode) {
        Mcode = mcode;
    }

    public double getQty() {
        return Qty;
    }

    public void setQty(double qty) {
        Qty = qty;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String tenantID) {
        TenantID = tenantID;
    }

    public String getWareHouseID() {
        return WareHouseID;
    }

    public void setWareHouseID(String wareHouseID) {
        WareHouseID = wareHouseID;
    }
}
