package HW7_4;

import HW7_3.CityType;
import HW7_3.HouseType;
import HW7_3.StreetType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JAXBExample {
    public static void main(String[] args) {
        try {
            File file = new File("city.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CityType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CityType city = (CityType) jaxbUnmarshaller.unmarshal(file);

            System.out.println("City: " + city.getName());
            System.out.println("Size: " + city.getSize());

            List<StreetType> streets = city.getStreet();
            for (StreetType street : streets) {
                System.out.println("Street: " + street.getName());
                HouseType house = street.getHouse();
                if (house != null) {
                    System.out.println("House number: " + house.getNumber());
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
