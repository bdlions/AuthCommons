package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class AvailabilityList extends ClientResponse{
    private List<Availability> availabilities;
    public AvailabilityList()
    {
        this.availabilities = new ArrayList<>();
    }

    public List<Availability> getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
    }
    
}
