package Hw7;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дані про товари:");

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            System.out.print("Назва товару: ");
            String productName = scanner.nextLine();
            System.out.print("Назва магазину: ");
            String shopName = scanner.nextLine();
            System.out.print("Вартість товару (грн): ");
            double productPrice = Double.parseDouble(scanner.nextLine());

            prices[i] = new Price(productName, shopName, productPrice);
        }

        System.out.print("Введіть назву магазину для пошуку: ");
        String searchShopName = scanner.nextLine();

        boolean shopFound = false;

        for (Price price : prices) {
            if (price.getShopName().equalsIgnoreCase(searchShopName)) {
                System.out.println("Товари, що продаються в магазині " + searchShopName + ":");
                System.out.println(price);
                shopFound = true;
            }
        }

        if (!shopFound) {
            System.out.println("Магазин з назвою " + searchShopName + " не знайдено.");
        }
    }
}
