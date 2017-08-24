package com.auction.dto;

/**
 *
 * @author nazmul hasan
 */
public class ProductSize {
    private int id;
    private String title;

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
    
    //to display object as a string in spinner
    @Override
    public String toString() {
        return title;
    }
}
