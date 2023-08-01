package HW7_3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class CityXMLParser extends DefaultHandler {
    private City city;
    private Street currentStreet;
    private StringBuilder data;

    public City parseCityXML(String filePath) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(filePath, this);
            return city;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        data = new StringBuilder();
        if (qName.equalsIgnoreCase("city")) {
            String name = attributes.getValue("name");
            String size = attributes.getValue("size");
            city = new City(name, size);
        } else if (qName.equalsIgnoreCase("street")) {
            String name = attributes.getValue("name");
            currentStreet = new Street(name, null);
        } else if (qName.equalsIgnoreCase("house")) {
            int number = Integer.parseInt(attributes.getValue("number"));
            currentStreet.setHouse(new House(number));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("street")) {
            city.addStreet(currentStreet);
        }
    }
}
