

import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> conversionRates = new HashMap<>();
        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.88);
        conversionRates.put("GBP", 0.76);
        conversionRates.put("INR", 74.83);
        conversionRates.put("AUD", 1.48);
        while (true) {
            System.out.println("Currency Converter");
            System.out.println("1. Convert Currency");
            System.out.println("2. View Conversion Rates");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertCurrency(conversionRates, scanner);
                    break;
                case 2:
                    viewConversionRates(conversionRates);
                    break;
                case 3:
                    System.out.println("Thank you for using the Currency Converter!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void convertCurrency(Map<String, Double> conversionRates, Scanner scanner) {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter from currency (USD/EUR/GBP/INR/AUD): ");
        String fromCurrency = scanner.next();
        System.out.print("Enter to currency (USD/EUR/GBP/INR/AUD): ");
        String toCurrency = scanner.next();

        double convertedAmount = amount * (conversionRates.get(toCurrency) / conversionRates.get(fromCurrency));
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
    }
    public static void viewConversionRates(Map<String, Double> conversionRates) {
        System.out.println("Conversion Rates:");
        for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
