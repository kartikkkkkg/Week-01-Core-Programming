import java.util.Scanner;
public class SmallestNumberChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter First Number");
      int number1 = scanner.nextInt();
      System.out.println("Enter Second Number");
      int number2 = scanner.nextInt();
      System.out.println("Enter Third Number");
      int number3 = scanner.nextInt();
      if (number1 < number2 && number1 < number3) {
         System.out.println("Is the first number the smallest? YES");
      } else {
         System.out.println("Is the first number the smallest? NO");
      }
      scanner.close();
   }
}