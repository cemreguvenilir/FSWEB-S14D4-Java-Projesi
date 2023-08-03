package Product;

public class Chocolate extends ProductForSale{
    private boolean isNut;

    public Chocolate(String type, double price, String description, boolean isNut) {
        super(type, price, description);
        this.isNut = isNut;
    }
    @Override
    public void showDetails() {
       String result = super.toString();
       StringBuilder builder = new StringBuilder();
       builder.append("isNut: " + isNut +"\n");
       System.out.println(result + builder.toString());

    }
}
