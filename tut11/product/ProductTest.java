package PR2.tut11.product;

public class ProductTest {
    public static void main(String[] args) throws Exception {
        Product laptop = new Product("Laptop", 39.99);
        Product iPad = new Product("iPad", 19.99);

        System.out.println(laptop);
        System.out.println(iPad);
    }
}
