package HW7_3;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String size;
    private List<Street> streets;

    public City(String name, String size) {
        this.name = name;
        this.size = size;
        streets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void addStreet(Street street) {
        streets.add(street);
    }
}
