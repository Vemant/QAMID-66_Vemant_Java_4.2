import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a height in centimeters");
        int heightCm= in.nextInt();
        System.out.println("Enter a weight in kg");
        int weightKg= in.nextInt();
        System.out.println("Your body mass index is " + service.calculate(heightCm, weightKg));
    }
}