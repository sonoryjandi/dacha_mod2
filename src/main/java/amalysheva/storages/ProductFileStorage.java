package amalysheva.storages;

import amalysheva.entities.Product;

public abstract class ProductFileStorage extends FileStorage<Product> {
    @Override
    protected Product deserialize(String answer) {
        String[] fields = answer.split(",");
        return new Product(Integer.parseInt(fields[0]),fields[1]);
    }
}
