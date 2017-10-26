package com.bdlions.dto;

/**
 *
 * @author nazmul hasan
 */
public class Currency {
    private int id;
    private String title;
    //this will not be added in database
    private CurrencyUnit currencyUnit;
    public Currency()
    {
        currencyUnit = new CurrencyUnit();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }
    
}
