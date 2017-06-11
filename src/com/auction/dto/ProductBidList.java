package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;

/**
 *
 * @author nazmul hasan
 */
public class ProductBidList extends ClientResponse{
    private ArrayList<ProductBid> productBidList;
    public ProductBidList()
    {
        productBidList = new ArrayList<>();
    }

    public ArrayList<ProductBid> getProductBidList() {
        return productBidList;
    }

    public void setProductBidList(ArrayList<ProductBid> productBidList) {
        this.productBidList = productBidList;
    }

    
}
