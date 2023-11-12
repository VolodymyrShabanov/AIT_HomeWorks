package home_work_38.repositories;

import home_work_38.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */
public class ProductsRepository {
    private static final int MAX_PRODUCTS_COUNT = 30;
    private final AtomicInteger currentId = new AtomicInteger(1);
    private Product[] products;
    private int productsCount;


    public ProductsRepository() {
        this.products = new Product[MAX_PRODUCTS_COUNT];
        setUp();
    }

    public void setUp() {
        addProduct("Gaming Mouse", 49.99, "High-precision, customizable, ergonomic design.");
        addProduct("Mechanical Keyboard", 89.99, "Backlit, tactile switches, programmable macros.");
        addProduct("Gaming Laptop", 1299.99, "Powerful GPU, high refresh rate display.");
        addProduct("Wireless Headset", 79.99, "Noise-canceling, comfortable fit, long battery life.");
        addProduct("Graphics Card", 499.99, "VR-ready, high-performance gaming graphics.");
        addProduct("Portable SSD", 129.99, "Lightning-fast data transfer, compact design.");
        addProduct("UltraWide Monitor", 699.99, "Immersive gaming and multitasking experience.");
        addProduct("Compact Gaming PC", 1499.99, "Small form factor, powerful gaming performance.");
        addProduct("Smart Wi-Fi Router", 149.99, "High-speed connectivity, advanced security features.");
        addProduct("VR Headset", 399.99, "Virtual reality immersion, intuitive controls.");
        addProduct("PRINTER", 12.99, "mfu");
        addProduct("monitor", 19.39, "color");
        addProduct("laptop", 50.55, "i-9, 16GbRam, 512 SSD");
    }

    public Product addProduct(String title, double price, String description) {
        Product product = new Product(currentId.getAndIncrement(), title, price, description);
        this.products[productsCount++] = product;
        return product;
    }

    public Product[] getAllProducts() {
        Product[] productsCopy = new Product[this.productsCount];
        for (int i = 0; i < productsCount; i++) {
            productsCopy[i] = products[i];
        }
        return productsCopy;
    }

    public Product findProductById(int id) {
        int index = indexById(id);
        if (index == -1) {
            return null;
        }
        return products[index];

    }

    public Product[] findProductsByPredicate(Predicate<Product> predicate) {
        int j = 0;
        Product[] result = new Product[j];
        for (int i = 0; i < productsCount; i++) {
            if (predicate.test(products[i])) {
                result = Arrays.copyOf(result, result.length + 1);
                result[j++] = products[i];
            }
        }
        return result;
    }

    public Product deleteProductsById(int id) {
        int index = indexById(id);

        if (index == -1) {
            return null;
        }

        Product deleteProduct = products[index];

        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        productsCount--;

        return deleteProduct;
    }

    public int indexById(int id) {
        for (int i = 0; i < this.productsCount; i++) {
            if (products[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean isContainsProduct(String title, double price, String description) {
        for (int i = 0; i < productsCount; i++) {
            if (products[i].getTitle().toLowerCase().equals(title)
                    && products[i].getPrice() == price
                    && products[i].getDescription().toLowerCase().equals(description)) {
                return true;
            }
        }
        return false;
    }


}

