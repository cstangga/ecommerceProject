package repository.productRepo;

import data.Product;

import java.util.ArrayList;
import java.util.List;

public class MemoryProductRepository implements ProductRepository{

    ArrayList<Product> repository;


    public MemoryProductRepository() {
        this.repository = new ArrayList<>();
    }

    @Override
    public boolean saveProduct(long id, String name, int price, int stock, String category) {
        boolean isExist = false;
        for(int i = 0; i< repository.size(); i++){
            if(repository.get(i).getId()==id)isExist=true;
        }
        if(!isExist){
            repository.add(new Product(id, name, price, stock, category));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deleteProduct(long id){
        int isExist = -1;
        for(int i = 0; i< repository.size(); i++){
            if(repository.get(i).getId()==id)isExist=i;
        }
        if(isExist==-1){
            return false;
        }
        else{
            repository.remove(isExist);
            return true;
        }
    }

    public List<Product> findProductById(long id){
        ArrayList<Product> results = new ArrayList<>();

    }
}
