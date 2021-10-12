public class Display implements View  {
    @Override
    public void displayProduct(Product product) {
        System.out.println("Displaying: "+product.toString());
    }
}
