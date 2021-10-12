public class Keyboard {
    private CashRegister model;

    public Keyboard(CashRegister model){
        this.model=model;
    }

    public void setUPCCode(int UPCCode){
        model.setUPCCode(UPCCode);
    }

    //One function to update all views of the model
    public void update(){
        model.updateViews(model.getCurrentProduct());
    }
}
