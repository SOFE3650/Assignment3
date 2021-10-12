//Similar functionality to Ex 1 driver code with a small change

public class MVCDriver {
    public static void main(String[] args){

        Display display=new Display();
        TicketPrinter printer=new TicketPrinter();

        CashRegister model=new CashRegister(display,printer);

        Keyboard keys=new Keyboard(model);
        Scanner scan=new Scanner(model);

        //Calls the keyboard's update method which notifies all observers of linked CashRegister
        scan.scannedUPCCode(10);
        keys.update();
        keys.setUPCCode(11);
        keys.update();
    }
}
