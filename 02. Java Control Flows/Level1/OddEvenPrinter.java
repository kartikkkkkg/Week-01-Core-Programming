import java.util.Scanner;
public class OddEvenPrinter {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter number");
      int number = scanner.nextInt();
      if (number > 0) {
         for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
               System.out.println(i + " is an EVEN Number");
            } else {
               System.out.println(i + " is an ODD Number");
            }
         }
      }
      scanner.close();
   }
}