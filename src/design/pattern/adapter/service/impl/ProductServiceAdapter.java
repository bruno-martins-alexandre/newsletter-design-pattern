package design.pattern.adapter.service.impl;

import design.pattern.adapter.service.CzechProductService;
import design.pattern.adapter.service.ProductService;
import design.pattern.adapter.service.product.CzechProduct;
import design.pattern.adapter.service.product.Product;

public class ProductServiceAdapter implements CzechProductService {

    private final ProductService productService;

    public ProductServiceAdapter(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public String showProductDetails(CzechProduct czechProduct) {

        double exchangeRate = 0.041;
        double priceInEuros = czechProduct.price() * exchangeRate;

        Product productAdapted = new Product(czechProduct.name(), priceInEuros);
        return productService.showProductDetails(productAdapted);
    }
}
