package com.example.prolo.Producer;

public class ProductData {
    String groupId;
    String productId;
    String productDescription;
    String scientificName;

    public ProductData(String groupId, String productId, String productDescription, String scientificName) {
        this.groupId = groupId;
        this.productId = productId;
        this.productDescription = productDescription;
        this.scientificName = scientificName;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getScientificName() {
        return scientificName;
    }
}
