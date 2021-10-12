//Same driver code as in Example 1

public class MVCDriver {
    public static void main(String[] args){

        Display display=new Display();
        TicketPrinter printer=new TicketPrinter();

        CashRegister model=new CashRegister(display,printer);

        Keyboard keys=new Keyboard(model);
        Scanner scan=new Scanner(model);

        scan.scannedUPCCode(10);
        keys.updateDisplay();
        keys.setUPCCode(11);
        keys.updateTicket();
    }
}
