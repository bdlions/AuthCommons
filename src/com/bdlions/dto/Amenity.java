package com.bdlions.dto;

/**
 *
 * @author nazmul hasan
 */
public class Amenity {
    private int id;
    private String title;
    //this will not be added into database
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
