package Homework4Abstr;

public class ConverterTemperature  {

    public ConverterTemperature(double Cel) {
        double Faren = (Cel * 1.8) + 32;
        double Kelvn = Cel + 273.15;
        System.out.println("Кельвіни: " + Kelvn + "\n" + "Фаренгейти: " + Faren);

    }

    public static void main(String[] args) {
        ConverterTemperature user1 = new ConverterTemperature(7);
    }
}
