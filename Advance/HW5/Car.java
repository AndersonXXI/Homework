package L5.HW_5;

public class Car {
    private String brand;
    public int year;
    protected double price;

    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public void startEngine() {
        System.out.println("Двигун запущено"); // Змінено текст повідомлення
    }

    public void accelerate() {
        System.out.println("Автомобіль прискорено");
    }

    private void stopEngine() {
        System.out.println("Двигун зупинено");
    }

}
