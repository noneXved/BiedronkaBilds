package bajno.domalewski;

import java.util.ArrayList;
import java.util.Arrays;

public class Bild {
    Product product;
    ArrayList<Product> listOfProducts = new ArrayList<>();

    public Bild() {
        addProductsToArray();
        printProducts();
    }

    public void addProductsToArray() {
        product = new Product("mleko", 1.99);
        listOfProducts.add(product);
        product = new Product("kanapka", 3.99);
        listOfProducts.add(product);
        product = new Product("maslo", 4.39);
        listOfProducts.add(product);
        product = new Product("chleb", 1.59);
        listOfProducts.add(product);
        product = new Product("ziemniaki", 2.29);
        listOfProducts.add(product);
        product = new Product("ketchup", 3.29);
        listOfProducts.add(product);
        product = new Product("piwo", 2.59);
        listOfProducts.add(product);
    }

    public void printProducts() {
        System.out.println(Arrays.deepToString(new ArrayList[]{listOfProducts}));

    }
}
