public class Display extends Observer {
    @Override
    public void update(Product product) {
        System.out.println("Displaying: "+product);
    }
}
