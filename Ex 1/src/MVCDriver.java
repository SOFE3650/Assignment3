public class MVCDriver {
    public static void main(String[] args){

        //Creates a new Display and TicketPrinter to use as our views
        Display display=new Display();
        TicketPrinter printer=new TicketPrinter();

        //Creates a new CashRegister with the display and printer views to use as our Model
        CashRegister model=new CashRegister(display,printer);

        //Creates a new Keyboard and Scanner with the model to use as our Controllers
        Keyboard keys=new Keyboard(model);
        Scanner scan=new Scanner(model);

        //Small functionality test of controllers and views
        scan.scannedUPCCode(10);
        keys.updateDisplay();
        keys.setUPCCode(11);
        keys.updateTicket();
    }
}
