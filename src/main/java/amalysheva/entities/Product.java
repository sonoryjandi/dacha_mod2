package amalysheva.entities;

import java.util.Objects;

public class Product implements Persistable {
    private int id;
    private String name;

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String getFilename() {
        return this.getId() + this.getName() + ".csv";
    }

    @Override
    public String toString(){
        return id + "," + name;
    }

    //region setter/getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
