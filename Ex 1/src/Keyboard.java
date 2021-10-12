public class Keyboard {
    private CashRegister model;

    public Keyboard(CashRegister model){
        this.model=model;
    }

    public void setUPCCode(int UPCCode){
        model.setUPCCode(UPCCode);
    }

    //Separate functions to update the Display or the TicketPrinter
    public void updateDisplay(){
        model.updateDisplay(model.getCurrentProduct().toString());
    }

    public void updateTicket(){
        model.updateTicket(model.getCurrentProduct().toString());
    }

}
