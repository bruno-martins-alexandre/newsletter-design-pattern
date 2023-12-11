package design.pattern.adapter.service.impl;

import design.pattern.adapter.service.ProductService;
import design.pattern.adapter.service.product.Product;

/**
 * Implementation of {@link ProductService}
 */
public class ProductServiceImpl implements ProductService {

    @Override
    public String showProductDetails(Product product) {
        return """
            Product name: %s
            Product price: %s euros
            """.formatted(product.name(), product.price());
    }
}
