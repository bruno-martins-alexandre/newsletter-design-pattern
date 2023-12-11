package design.pattern.adapter.service;

import design.pattern.adapter.service.product.Product;

public interface ProductService {

    /**
     * Returns the name and price of a product
     *
     * @param product product
     * @return details of the product
     */
    String showProductDetails(Product product);

}
