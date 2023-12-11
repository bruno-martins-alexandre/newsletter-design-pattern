package design.pattern.adapter.service.product;

/**
 * This class represents an object sold in euros
 *
 * @param name  name of the product
 * @param price price of the product (in euros)
 */
public record Product(String name, double price) {
}
