package models;

public class Hat {
    private String color;
    private String brand;
    private String size;
    private float price;
    private int qty;

    public Hat(String expectedColor, String expectedBrand, String expectedSize, float expectedPrice, int expectedQty) {
        this.color = expectedColor;
        this.brand = expectedBrand;
        this.size = expectedSize;
        this.price = expectedPrice;
        this.qty = expectedQty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
