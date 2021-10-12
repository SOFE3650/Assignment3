public class TicketPrinter implements View {
    @Override
    public void displayProduct(Product product) {
        System.out.println("Ticketing: "+product.toString());
    }
}
