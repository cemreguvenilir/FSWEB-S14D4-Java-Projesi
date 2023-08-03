import Product.Bread;
import Product.Chocolate;
import Product.Coke;
import Product.ProductForSale;
public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("snack", 12, "a box of chocolate", true);
        products[1] = new Coke("beverage", 15, "a bottle", 1);
        products[2] = new Bread("bakery", 5, "loaf of bread", 200);



        listProducts(products);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null){
            for (ProductForSale product: products){
                if (product != null){
                    product.showDetails();
                }
            }
        }

    }
}