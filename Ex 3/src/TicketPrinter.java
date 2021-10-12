public class TicketPrinter extends Observer {
    @Override
    public void update(Product product) {
        System.out.println("Ticketing: "+product);
    }
}
