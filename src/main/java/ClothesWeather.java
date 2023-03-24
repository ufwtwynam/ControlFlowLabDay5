import java.util.Scanner;
public class ClothesWeather {
    public static void main(String[] args) {
        // normally use pseudocode, but since we understand the logic here no need, just take code down and listen
        // BOUNCER PATTERN: checks at the beginning of a function, each check is done individually
        Scanner reader = new Scanner(System.in);

        System.out.println("Please describe the weather (e.g. sunny, rainy, snow");
        String weather = reader.nextLine();

        System.out.println("Please enter the temperature in Celsius");
        int temperature = reader.nextInt();

        // done to change user's input to lowercase
        if (weather.toLowerCase().equals("sunny") && temperature > 8){
            System.out.println("Short sleeve and shorts");
        }
        if (weather.toLowerCase().equals("sunny") && temperature < 8){
            System.out.println("Sunglasses and a thin coat");
        }
    }
}
