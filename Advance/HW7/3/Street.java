package HW7_3;

public class Street {
    private String name;
    private House house;

    public Street(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
