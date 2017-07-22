package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;

/**
 *
 * @author nazmul hasan
 */
public class PriceList extends ClientResponse{
    private ArrayList<Price> prices;
    public PriceList()
    {
        this.prices = new ArrayList<>();
    }

    public ArrayList<Price> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Price> prices) {
        this.prices = prices;
    }    
}
