package HW8;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120.f,"AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120.f, "AB1234567CD", 1280, 1024);
        EthernetAdapter adapter = new EthernetAdapter("TP-Link", 50.0f, "AB1234567CD", 1000, "AB:CD:EF:12:34:56");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(adapter);
        System.out.println(monitor.equals(device));
        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(adapter.hashCode());

    }
}
