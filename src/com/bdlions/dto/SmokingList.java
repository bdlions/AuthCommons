package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class SmokingList extends ClientResponse{
    private List<Smoking> smokings;
    public SmokingList()
    {
        this.smokings = new ArrayList<>();
    }

    public List<Smoking> getSmokings() {
        return smokings;
    }

    public void setSmokings(List<Smoking> smokings) {
        this.smokings = smokings;
    }
    
      
}
