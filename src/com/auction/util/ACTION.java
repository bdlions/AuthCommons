/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.util;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author alamgir
 */
public enum ACTION {
    @SerializedName("1001")
    SIGN_IN(1001, REQUEST_TYPE.AUTH),
    @SerializedName("1002")
    SIGN_OUT(1002, REQUEST_TYPE.AUTH),
    @SerializedName("1004")
    SIGN_UP(1004, REQUEST_TYPE.AUTH),
    @SerializedName("1003")
    FETCH_PRODUCT_LIST(1003, REQUEST_TYPE.REQUEST),
    
    @SerializedName("2023")
    FETCH_USER_LIST(2023, REQUEST_TYPE.REQUEST),
    @SerializedName("2025")
    FETCH_MEMBER_ROLES(2025, REQUEST_TYPE.REQUEST),
    @SerializedName("2017")
    FETCH_MY_PRODUCT_LIST(2017, REQUEST_TYPE.REQUEST),
    @SerializedName("2021")
    FETCH_SAVED_PRODUCT_LIST(2021, REQUEST_TYPE.REQUEST),
    @SerializedName("2022")
    FETCH_CLOSING_PRODUCT_LIST(2022, REQUEST_TYPE.REQUEST),
    @SerializedName("2001")
    FETCH_LOCATION_LIST(2001, REQUEST_TYPE.REQUEST),
    @SerializedName("2003")
    FETCH_RADIUS_LIST(2003, REQUEST_TYPE.REQUEST),
    @SerializedName("2004")
    FETCH_PRODUCT_TYPE_LIST(2004, REQUEST_TYPE.REQUEST),
    @SerializedName("2012")
    FETCH_PRODUCT_SIZE_LIST(2012, REQUEST_TYPE.REQUEST),
    @SerializedName("2013")
    FETCH_PRODUCT_CATEGORY_LIST(2013, REQUEST_TYPE.REQUEST),
    @SerializedName("2024")
    FETCH_PRODUCT_AMENITY_LIST(2024, REQUEST_TYPE.REQUEST),
    @SerializedName("2014")
    FETCH_STAY_LIST(2014, REQUEST_TYPE.REQUEST),
    @SerializedName("2015")
    FETCH_SMOKING_LIST(2015, REQUEST_TYPE.REQUEST),
    @SerializedName("2016")
    FETCH_PET_LIST(2016, REQUEST_TYPE.REQUEST),
    @SerializedName("2005")        
    FETCH_OCCUPATION_LIST(2005, REQUEST_TYPE.REQUEST),
    @SerializedName("2006")
    FETCH_GENDER_LIST(2006, REQUEST_TYPE.REQUEST),
    @SerializedName("2007")
    FETCH_ROOM_SIZE_LIST(2007, REQUEST_TYPE.REQUEST),
    @SerializedName("2008")
    FETCH_DURATION_LIST(2008, REQUEST_TYPE.REQUEST),
    @SerializedName("2009")
    FETCH_MIN_PRICE_LIST(2009, REQUEST_TYPE.REQUEST),
    @SerializedName("2010")
    FETCH_MAX_PRICE_LIST(2010, REQUEST_TYPE.REQUEST),
    @SerializedName("2011")
    FETCH_BID_LIST(2011, REQUEST_TYPE.REQUEST),
    @SerializedName("2018")
    FETCH_MESSAGE_INBOX_LIST(2018, REQUEST_TYPE.REQUEST),
    @SerializedName("2019")
    FETCH_MESSAGE_INFO(2019, REQUEST_TYPE.REQUEST),
    @SerializedName("2020")
    FETCH_MESSAGE_SENT_LIST(2020, REQUEST_TYPE.REQUEST),
    @SerializedName("2026")
    FETCH_STAT_LIST(2026, REQUEST_TYPE.REQUEST),
    @SerializedName("2027")
    FETCH_AVAILABILITY_LIST(2027, REQUEST_TYPE.REQUEST),
    
    @SerializedName("3001")
    FETCH_PRODUCT_INFO(3001, REQUEST_TYPE.REQUEST),
    @SerializedName("3002")
    FETCH_USER_INFO(3002, REQUEST_TYPE.REQUEST),
    @SerializedName("3003")
    FETCH_ACCOUNT_SETTING_FA(3003, REQUEST_TYPE.REQUEST),
    
    @SerializedName("4001")
    UPDATE_USER_INFO(4001, REQUEST_TYPE.UPDATE),
    @SerializedName("4002")
    UPDATE_USER_PROFILE_PICTURE(4002, REQUEST_TYPE.UPDATE),
    @SerializedName("4003")
    UPDATE_USER_DOCUMENT(4003, REQUEST_TYPE.UPDATE),
    @SerializedName("4004")
    UPDATE_PRODUCT_INFO(4004, REQUEST_TYPE.UPDATE),
    @SerializedName("4005")
    SAVE_ACCOUNT_SETTING_FA(4005, REQUEST_TYPE.UPDATE),
    @SerializedName("4006")
    UPDATE_USER_LOGO(4006, REQUEST_TYPE.UPDATE),
    
    @SerializedName("5001")
    ADD_PRODUCT(5001, REQUEST_TYPE.UPDATE),
    @SerializedName("5002")
    ADD_PRODUCT_BID(5002, REQUEST_TYPE.UPDATE),
    @SerializedName("5003")
    ADD_MESSAGE_TEXT(5003, REQUEST_TYPE.UPDATE),
    @SerializedName("5004")
    ADD_MESSAGE_INFO(5004, REQUEST_TYPE.UPDATE),
    @SerializedName("5005")
    ADD_SAVED_PRODUCT(5005, REQUEST_TYPE.UPDATE),
    ;

    private int id;
    private REQUEST_TYPE requestType;
    private ACTION(int id, REQUEST_TYPE requestType) {
        this.id = id;
        this.requestType = requestType;
    }
    
    public int getId(){
        return id;
    }
    
    public REQUEST_TYPE getRequestType(){
        return requestType;
    }
}
