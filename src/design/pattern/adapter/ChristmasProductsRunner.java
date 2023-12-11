package design.pattern.adapter;

import design.pattern.adapter.service.CzechProductService;
import design.pattern.adapter.service.ProductService;
import design.pattern.adapter.service.impl.ProductServiceAdapter;
import design.pattern.adapter.service.impl.ProductServiceImpl;
import design.pattern.adapter.service.product.CzechProduct;
import design.pattern.adapter.service.product.Product;
import java.util.List;

public class ChristmasProductsRunner {

    public static void main(String... args) {

        List<Product> products = List.of(
            new Product("PlayStation 5", 499.99),
            new Product("Timberland boots", 199.99),
            new Product("Nike t-shirt", 14.99)
        );

        List<CzechProduct> czechProducts = List.of(
            new CzechProduct("Perfume", 2000),
            new CzechProduct("Crystal figure", 9000)
        );

        ProductService productService = new ProductServiceImpl();
        CzechProductService productServiceAdapter = new ProductServiceAdapter(productService);

        System.out.println("Products to sell: ");
        products.forEach(product -> System.out.println(productService.showProductDetails(product)));
        czechProducts.forEach(czechProduct -> System.out.println(productServiceAdapter.showProductDetails(czechProduct)));


    }

}
