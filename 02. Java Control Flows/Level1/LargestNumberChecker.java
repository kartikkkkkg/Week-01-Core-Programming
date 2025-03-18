import java.util.Scanner;
public class LargestNumberChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter First Number");
      int number1 = scanner.nextInt();
      System.out.println("Enter Second Number");
      int number2 = scanner.nextInt();
      System.out.println("Enter Third Number");
      int number3 = scanner.nextInt();
      if (number1 > number2 && number1 > number3) {
         System.out.println("Is the first number the largest? YES\nIs the second number the largest? NO\nIs the third number the largest? NO");
      } else if (number2 > number1 && number2 > number3) {
         System.out.println("Is the first number the largest? NO\nIs the second number the largest? YES\nIs the third number the largest? NO");
      } else {
         System.out.println("Is the first number the largest? NO\nIs the second number the largest? NO\nIs the third number the largest? YES");
      }
      scanner.close();
   }
}