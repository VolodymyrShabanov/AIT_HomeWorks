package home_work_38_practice.services;

import home_work_38_practice.models.Product;
import home_work_38_practice.repositories.ProductsRepository;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */
public class ProductService {

    private final ProductsRepository productsRepository;

    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product createNeuProduct(String title, double price, String description) {
        if (title == null || price < 0 || description == null) {
            System.err.println("Incorrect parameters!");
            return null;
        }

        if (productsRepository.isContainsProduct(title, price, description)) {
            System.err.println("This product already exists!");
            return null;
        }

        System.out.println("New product created!");
        return productsRepository.addProduct(title, price, description);
    }

    public Product[] allProducts() {
        return productsRepository.getAllProducts();
    }

    public Product getProductById(int id) {
        if (id < 0) {
            System.err.println("Id - incorrect!");
            return null;
        }

        Product getProductById = productsRepository.findProductById(id);

        if (getProductById == null) {
            System.err.printf("Product with this 'id: %d' does not exist.\n", id);
            return null;
        }

        return getProductById;
    }

    public Product[] getProductsByTitle(String title) {
        if (title == null) {
            System.err.println("Title - incorrect!");
            return null;
        }

        return productsRepository.findProductsByPredicate(
                product -> product.getTitle().toLowerCase().contains(title.toLowerCase()));
    }

    public Product[] getProductsByDescription(String description) {
        if (description == null) {
            System.err.println("Description - incorrect!");
            return null;
        }

        return productsRepository.findProductsByPredicate(
                product -> product.getDescription().toLowerCase().contains(description.toLowerCase()));
    }

    public Product[] getProductsByPrice(double min, double max) {
        return productsRepository.findProductsByPredicate(
                product -> product.getPrice() >= min && product.getPrice() <= max);
    }

    public Product deleteProductById(int id) {
        if (id < 0) {
            System.err.println("Id - incorrect!");
            return null;
        }

        Product deleteProduct = productsRepository.deleteProductsById(id);
        if (deleteProduct == null) {
            System.err.printf("Product with this 'id: %d' does not exist.\n", id);
            return null;
        }

        return deleteProduct;
    }


    public boolean isContainsProduct(String title, double price, String description) {
        return productsRepository.isContainsProduct(title, price, description);
    }


}