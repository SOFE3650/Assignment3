import java.util.ArrayList;

public class CashRegister {
    private int UPCCode;
    private Product currentProduct;
    private ProductDB database = new ProductDB();
    private ArrayList<Observer> viewList;

    //Registers the views as Observers
    public CashRegister(Display viewD, TicketPrinter viewT) {
        this.viewList = new ArrayList<>();
        register(viewD);
        register(viewT);
    }

    public void register(Observer view){
        viewList.add(view);
        System.out.println("Adding a new "+view.getClass()+" to viewList");
    }

    public void unregister(Observer view){
        try{
            viewList.remove(view);
            System.out.println("Removed an existing"+view.getClass()+" from viewList");
        }catch (NullPointerException e){
            System.out.println("No such view in viewList");
        }
    }

    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct=database.getProductInfo(UPCCode);
    }

    public Product getCurrentProduct() {
        return currentProduct;
    }

    //Updates all views within the viewList
    public void updateViews(Product product){
        for (Observer o : viewList){
            o.update(product);
        }
    }
}
