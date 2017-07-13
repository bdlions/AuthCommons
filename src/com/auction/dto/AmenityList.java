package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class AmenityList extends ClientResponse{
    private List<Amenity> amenities;
    public AmenityList()
    {
        this.amenities = new ArrayList<>();
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }
    
}
