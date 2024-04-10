import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int numberOfRandomNumbers = 10; // Change this value to generate more or fewer random numbers
        int minRange = 1; // Minimum value for the random numbers
        int maxRange = 100; // Maximum value for the random numbers
        
        // Create a Random object
        Random random = new Random();
        
        // Generate and print random numbers
        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println(randomNumber);
        }
    }
}
