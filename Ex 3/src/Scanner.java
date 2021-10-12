public class Scanner {
    private CashRegister model;

    public Scanner(CashRegister model){
        this.model=model;
    }

    public void scannedUPCCode(int UPCCode){
        model.setUPCCode(UPCCode);
    }
}
