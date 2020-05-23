package bajno.domalewski;

public class Product {
    private static int productID = 0;
    private int id;
    private double price;
    private String nameProduct;

    public Product(String name, double price) {
        id = productID++;
        this.nameProduct = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() { return id; }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "Product:" + "price=" + price + ", name='" + nameProduct + '\'' + "}\n";
    }
}
