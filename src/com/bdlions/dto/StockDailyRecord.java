/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdlions.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alamgir
 */
public class StockDailyRecord implements Serializable {

    private Integer recordId;
    private Stock stock;
    private Float priceOpen;
    private Float priceClose;
    private Float priceChange;
    private Long volume;
    private Date date;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Float getPriceOpen() {
        return priceOpen;
    }

    public void setPriceOpen(Float priceOpen) {
        this.priceOpen = priceOpen;
    }

    public Float getPriceClose() {
        return priceClose;
    }

    public void setPriceClose(Float priceClose) {
        this.priceClose = priceClose;
    }

    public Float getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(Float priceChange) {
        this.priceChange = priceChange;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
