public class CashRegister {
    private int UPCCode;
    private Product currentProduct;
    private ProductDB database = new ProductDB();
    private Display viewD;
    private TicketPrinter viewT;

    public CashRegister(Display viewD, TicketPrinter viewT) {
        this.viewD = viewD;
        this.viewT = viewT;
    }

    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct=database.getProductInfo(UPCCode);
    }

    public Product getCurrentProduct() {
        return currentProduct;
    }

    //Changes the update functions to pass a Product instead of a String
    public void updateDisplay(Product product) {
        viewD.displayProduct(product);
    }

    public void updateTicket(Product product) {
        viewT.displayProduct(product);
    }
}
