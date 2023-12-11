package design.pattern.adapter.service.product;

/**
 * This class represents an object sold in czech crowns
 *
 * @param name  name of the product
 * @param price price of the product (in czk)
 */
public record CzechProduct(String name, double price) {
}
