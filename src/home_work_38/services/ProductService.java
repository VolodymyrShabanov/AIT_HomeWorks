package home_work_38.services;

import home_work_38.models.Product;
import home_work_38.repositories.ProductsRepository;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */
public class ProductService {

    private ProductsRepository productsRepository;

    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }



}
