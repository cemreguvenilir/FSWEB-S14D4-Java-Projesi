package Product;

public class Bread extends ProductForSale{
    private double gr;

    public Bread(String type, double price, String description, double gr) {
        super(type, price, description);
        this.gr = gr;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("gr: " + gr +"\n");
        System.out.println(result + builder.toString());


    }
}
