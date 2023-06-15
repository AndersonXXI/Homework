package HW_6;

public enum Vehicles {
    CAR(20000, "Red"),
    MOTORCYCLE(10000, "Blue"),
    TRUCK(50000, "Green");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name() + " (Color: " + color + ", Price: " + price + ")";
    }
}
