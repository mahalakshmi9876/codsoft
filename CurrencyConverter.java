import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Currency Converter");
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        
        // Fixed exchange rate (e.g., 1 USD = 0.85 EUR)
        double exchangeRateUSDToEUR = 0.85;
        double exchangeRateUSDToGBP = 0.75;
        
        // Convert USD to EUR and GBP
        double eurAmount = usdAmount * exchangeRateUSDToEUR;
        double gbpAmount = usdAmount * exchangeRateUSDToGBP;
        
        System.out.println("Amount in EUR: " + eurAmount);
        System.out.println("Amount in GBP: " + gbpAmount);
        
        scanner.close();
    }
}
