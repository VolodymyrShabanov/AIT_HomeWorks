package home_work_38.repositories;

import home_work_38.models.Product;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */
public class ProductsRepository {
    private static final int MAX_PRODUCTS_COUNT = 30;
    private Product[] products;
    private int productsCount;

    public ProductsRepository() {
        this.products = new Product[MAX_PRODUCTS_COUNT];
    }

    public void saveProduct(Product product) {
        if (product == null) return;
        this.products[productsCount++] = product;
    }























}
