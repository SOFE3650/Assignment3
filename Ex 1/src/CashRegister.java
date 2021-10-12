public class CashRegister {
    private int UPCCode;
    private Product currentProduct;
    private ProductDB database = new ProductDB();
    private Display viewD;
    private TicketPrinter viewT;

    //Instantiates the CashRegister with a Display and TicketPrinter
    public CashRegister(Display viewD, TicketPrinter viewT) {
        this.viewD = viewD;
        this.viewT = viewT;
    }

    //Updates the CashRegisters UPCCode and fetches the corresponding product from the ProductDB
    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct=database.getProductInfo(UPCCode);
    }

    public Product getCurrentProduct() {
        return currentProduct;
    }

    //A separate update function for each view
    public void updateDisplay(String toString) {
        viewD.displayText(toString);
    }

    public void updateTicket(String toString) {
        viewT.displayText(toString);
    }
}
