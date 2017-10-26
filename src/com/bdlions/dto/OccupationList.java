package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class OccupationList extends ClientResponse{
    private List<Occupation> occupations;
    public OccupationList()
    {
        this.occupations = new ArrayList<>();
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }
    
}
