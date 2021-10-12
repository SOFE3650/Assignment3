public class Product {
    private int UPCCode;
    private double price;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "UPCCode=" + UPCCode +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public int getUPCCode() {
        return UPCCode;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(int UPCCode, double price, String name) {
        this.UPCCode = UPCCode;
        this.price = price;
        this.name = name;
    }
}
