package PR2.tut11.product;
import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    //constructor
    public Product() {
    }

    public Product(String name, double price) throws Exception{
        this.name = name;
        this.price = price;
    }

    //getter && setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid name!");
        } else this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) throws Exception {
        if (!isValidPrice(price)) {
            throw new Exception("Invalid price");
        } else this.price = price;
    }

    //validator
    public boolean isValidName(String name) {
        return this.name.length() <= 50 && this.name.trim() != null && this.name.trim() != "" && this.name.trim() != " ";
    }

    public boolean isValidPrice(double price) {
        return this.price > 0;
    }

    @Override
    public String toString() {
        return "Product[" +
                "name=" + this.getName() +
                ", price=" + this.getPrice() +
                ']';
    }
}
