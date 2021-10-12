import java.util.HashMap;

public class ProductDB {
    private HashMap<Integer, Product> database=new HashMap<>();

    public ProductDB() {
        database.put(10, new Product(10, 1.99, "water"));
        database.put(11, new Product(11, 4.99, "eggs"));
        database.put(12, new Product(12, 0.99,"rock"));
    }

    public Product getProductInfo(int UPCCode){
        return database.get(UPCCode);
    }
}
