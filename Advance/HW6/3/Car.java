package Hw6_3;

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}
