package HW8;

import java.util.Objects;

public class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber,int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;
        if (monitor.getManufacturer() != monitor.getManufacturer()) return false;
        if (monitor.getPrice() != monitor.getPrice()) return false;
        if (monitor.getSerialNumber() != monitor.getSerialNumber()) return false;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '!';
    }
}




