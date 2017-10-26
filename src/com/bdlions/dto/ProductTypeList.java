package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class ProductTypeList extends ClientResponse{
    private List<ProductType> productTypes;
    public ProductTypeList()
    {
        this.productTypes = new ArrayList<>();
    }

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }
    
}
