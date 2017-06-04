package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class ProductSizeList extends ClientResponse{
    private List<ProductSize> productSizes;
    public ProductSizeList()
    {
        this.productSizes = new ArrayList<>();
    }

    public List<ProductSize> getProductSizes() {
        return productSizes;
    }

    public void setProductSizes(List<ProductSize> productSizes) {
        this.productSizes = productSizes;
    }    
}
