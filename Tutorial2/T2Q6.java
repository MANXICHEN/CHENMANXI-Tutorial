package Tutorial2;
import java.util.Scanner;

public class T2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter diameter: ");

        double diameter = scanner.nextDouble();

        double circumference = Math.PI * diameter;

        System.out.printf("The circumference of the circle is : %.3f\n", circumference);

        scanner.close();
    }
}
