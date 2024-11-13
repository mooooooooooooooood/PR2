package PR2.tut11.product;
import java.io.Serializable;

public class ProductDAO extends DAO<Product> {
    @Override
    public void update(Product product) {
        for (int i = 0; i < dataList.size(); i++) {
            Product existingProduct = dataList.get(i);
            if (existingProduct.getName().equals(product.getName())) {
                dataList.set(i, product);
                return;
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        String productName = (String) id;
        for (Product product : dataList) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
