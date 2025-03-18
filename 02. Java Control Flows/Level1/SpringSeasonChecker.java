import java.util.Scanner;
public class SpringSeasonChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter month");
      int month = scanner.nextInt();
      System.out.println("enter day");
      int day = scanner.nextInt();
      if ((month == 3 && day >= 20 && day <= 31) || 
          (month == 4 && day >= 1 && day <= 30) || 
          (month == 5 && day >= 1 && day <= 31) || 
          (month == 6 && day >= 1 && day <= 20)) {
         System.out.println("It's a spring season");
      } else {
         System.out.println("It's not a spring season");
      }
      scanner.close();
   }
}