package repository.productRepo;

import data.Product;

public interface ProductRepository {
    public Product findById(long id);
}
