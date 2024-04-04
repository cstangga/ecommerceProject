package repository.productRepo;

import data.Product;

public interface ProductRepository {
    public boolean saveProduct(long id, String name, int price, int stock, String category);
}
