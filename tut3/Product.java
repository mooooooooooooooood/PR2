package PR2.tut3;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double discount;

    //constructors
    //khai báo objects
    public Product () {
    }
    public Product (String name) {
        this.name = name;
    }
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product (String name, double price, double discount) {
        this.name = name; //null
        this.price = price; //0.0
        this.discount = discount; //0.0
    }
    //getter lấy dữ liệu & setter(validation)
    //getters
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }
    //setters(validation)
    private boolean isInvalidName(String name) {
        return name.matches(".*\\d+.*");
    }
    public void setName(String newName) throws Exception {
        if (!isInvalidName(newName)) {
            this.name = newName;
        } else {
            throw new Exception("Invalid name: " + newName);
        }
    }
    //public boolean setName (String newName) {
    //  if (!isInvalidName(newName) {
    //      this.name = newName;
    //      return true;
    //  } else {
    //      return false;
    //  }
    private boolean isValidPrice (double price) {
        return price >= 0;
    }
    public void setPrice(double newPrice) throws Exception{
        if (!isValidPrice(newPrice)) {
            this.price = newPrice;
        } else {
            throw new Exception("Invalid price: " + newPrice);
        }
    }

    //methods
    public double calculateImportTax () {
        return 0.1 * this.price;
    }

    public void displayDetails () {
        // Cách 1: dùng toString()
        //sysbut(this.toString())

        //cách 2: custom display
        //systemout("....")
        System.out.println("Product Name: " + this.getName());
        System.out.println("Original Price: $" + this.getPrice());
        System.out.println("Discount: " + (this.getDiscount() * 100) + "%");
        System.out.println("Tax: "+ this.calculateImportTax());
    }

    public void promptDetails() {
        this.name = promptName();
        this.price = promptPrice();
        this.discount = promptDiscount();
    }
    private String promptName() {
        //get data from user
        //validate
        //repeat to re-enter
        Scanner sc = new Scanner(System.in);
        boolean gotIt = false;
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        while (!gotIt) {
            if (!isInvalidName(productName)){
                System.out.println("Invalid name. Please re-enter the product name: ");
                productName = sc.nextLine();
            } else {
                gotIt = true;
            }
        }
        return productName;
    }

    private double promptPrice() {
        Scanner sc = new Scanner(System.in);
        double price;
        do {
            System.out.println("Enter product price: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid price. Please enter a number.");
                sc.nextLine();
            }
            price = sc.nextDouble();
            if (price < 0) {
                System.out.println("Price must be greater than or equal to 0.");
            }
        } while (price < 0);
        return price;
    }

    private double promptDiscount() {
        Scanner sc = new Scanner(System.in);
        double discount;
        do {
            System.out.println("Enter product discount: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid discount. Please enter a number.");
                sc.nextLine();
            }
            discount = sc.nextDouble();
            if (discount < 0 || discount > 100) {
                System.out.println("Discount must be a number between [0.0 - 100.0].");
            }
        } while (discount < 0 || discount > 100);
        return discount;
    }

    public static void main(String[] args) {
        Product laptop = new Product ("Laptop", 1000, 10);
        laptop.displayDetails();
    }
}
