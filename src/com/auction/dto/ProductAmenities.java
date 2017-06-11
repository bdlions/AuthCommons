package com.auction.dto;

import java.io.Serializable;

/**
 *
 * @author nazmul hasan
 */
public class ProductAmenities implements Serializable{
    private int id;
    private Amenity amenity;
    private Product product; 
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Amenity getAmenity() {
        return amenity;
    }

    public void setAmenity(Amenity amenity) {
        this.amenity = amenity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
