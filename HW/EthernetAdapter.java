package HW8;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer,price,serialNumber);
        this.speed = speed;
        this.mac = mac;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter adapter = (EthernetAdapter) obj;
        if (speed != adapter.speed) return false;
        if (mac != adapter.mac) return false;
        if (adapter.getManufacturer() != adapter.getManufacturer()) return false;
        if (adapter.getPrice() != adapter.getPrice()) return false;
        if (adapter.getSerialNumber() != adapter.getSerialNumber()) return false;

        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '!';
    }
}
