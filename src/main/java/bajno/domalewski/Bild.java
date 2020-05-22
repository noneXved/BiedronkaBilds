package bajno.domalewski;

public class Bild {
    private String nameProduct;
    private int price;

    public Bild(String name, int price) {
        this.nameProduct = name;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
