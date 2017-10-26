package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class ProductCategoryList extends ClientResponse{
    private List<ProductCategory> productCategories;
    public ProductCategoryList()
    {
        this.productCategories = new ArrayList<>();
    }

    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

      
}
