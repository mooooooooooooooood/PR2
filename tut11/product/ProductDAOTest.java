package PR2.tut11.product;

import java.util.List;

public class ProductDAOTest {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        try {
            productDAO.add(new Product("Laptop", 999.99));
            productDAO.add(new Product("Smartphone", 599.99));
            productDAO.add(new Product("Tablet", 299.99));
        } catch (Exception e) {
            System.out.println("Error while adding products: " + e.getMessage());
        }

        System.out.println("List of Products:");
        List<Product> productList = productDAO.getList();
        for (Product product : productList) {
            System.out.println(product);
        }

        // Test find method
        Product foundProduct = productDAO.find("Smartphone");
        if (foundProduct != null) {
            System.out.println("Found product(id = Smartphone): " + foundProduct.getName() + ", Price: $" + foundProduct.getPrice());
        } else {
            System.out.println("Product "+ foundProduct.getName() + " not found.");
        }

        // Test update method
        try {
            Product newProduct = new Product("Smartphone", 649.99);
            productDAO.update(newProduct);
        } catch (Exception e) {
            System.out.println("Error while updating product: " + e.getMessage());
        }

        // Test find method again after update
        foundProduct = productDAO.find("Smartphone");
        if (foundProduct != null) {
            System.out.println("Found product(id = Smartphone): " + foundProduct.getName() + ", Price: $" + foundProduct.getPrice());
        } else {
            System.out.println("Product (id = Smartphone) not found.");
        }

        Product foundProduct1 = productDAO.find("iPad");
        if (foundProduct1 != null) {
            System.out.println("Found product: " + foundProduct1.getName() + ", Price: $" + foundProduct1.getPrice());
        } else {
            System.out.println("Product (id = iPad) not found.");
        }
    }
}
