package Tutorial2;
import java.util.Scanner; 

public class T2Q7 {
    public static void main(String[] args) {
       
        final double INCH_TO_CM = 2.54;
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in inch: ");

        double inches = scanner.nextDouble();

        double meters = (inches * INCH_TO_CM) / 100.0;

        System.out.printf("%.2f inches = %.2f meters\n", inches, meters);
       
        scanner.close();
    }
}

