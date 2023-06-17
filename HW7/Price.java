package Hw7;

public class Price {
    private String productName;
    private String shopName;
    private double productPrice;

    public Price(String productName, String shopName, double productPrice) {
        this.productName = productName;
        this.shopName = shopName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getShopName() {
        return shopName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Товар: " + productName +
                ", Магазин: " + shopName +
                ", Вартість: " + productPrice + " грн";
    }
}
