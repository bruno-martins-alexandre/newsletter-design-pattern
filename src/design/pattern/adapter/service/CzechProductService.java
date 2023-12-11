package design.pattern.adapter.service;

import design.pattern.adapter.service.product.CzechProduct;

public interface CzechProductService {

    /**
     * Returns the name and price of a czech product
     *
     * @param czechProduct product
     * @return details of the product
     */
    String showProductDetails(CzechProduct czechProduct);

}
