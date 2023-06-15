package HW_6;

public class Main2 {
    public static void main(String[] args) {
        Vehicles car = Vehicles.CAR;
        Vehicles motorcycle = Vehicles.MOTORCYCLE;
        Vehicles truck = Vehicles.TRUCK;

        System.out.println(car.toString());
        System.out.println("Color of the motorcycle: " + motorcycle.getColor());
        System.out.println(truck.toString());

    }
}
