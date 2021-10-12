public class Keyboard {
    private CashRegister model;

    public Keyboard(CashRegister model){
        this.model=model;
    }

    public void setUPCCode(int UPCCode){
        model.setUPCCode(UPCCode);
    }

    public void updateDisplay(){
        model.updateDisplay(model.getCurrentProduct());
    }

    public void updateTicket(){
        model.updateTicket(model.getCurrentProduct());
    }

}
