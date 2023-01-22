import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    

        System.out.print("Enter the weight of the water in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the desired final temperature of the water in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy required to heat the water is " + energy);
    }
}
