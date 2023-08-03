package Product;

public class Coke extends ProductForSale{
    private double litre;

    public Coke(String type, double price, String description, double litre) {
        super(type, price, description);
        this.litre = litre;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("litre: " + litre +"\n");
        System.out.println(result + builder.toString());
    }
}
