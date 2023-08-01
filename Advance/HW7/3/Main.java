package HW7_3;

public class Main {
    public static void main(String[] args) {
        String filePath = "city.xml";
        CityXMLParser parser = new CityXMLParser();
        City city = parser.parseCityXML(filePath);

        if (city != null) {
            System.out.println("City: " + city.getName());
            System.out.println("Size: " + city.getSize());
            for (Street street : city.getStreets()) {
                System.out.println("Street: " + street.getName());
                if (street.getHouse() != null) {
                    System.out.println("House number: " + street.getHouse().getNumber());
                }
            }
        }
    }
}
