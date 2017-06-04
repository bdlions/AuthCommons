package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class PetList extends ClientResponse{
    private List<Pet> pets;
    public PetList()
    {
        this.pets = new ArrayList<>();
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }      
}
