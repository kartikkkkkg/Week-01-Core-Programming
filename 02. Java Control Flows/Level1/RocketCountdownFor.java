import java.util.Scanner;
public class RocketCountdownFor {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter number");
      int number = scanner.nextInt();
      for (int counter = number; counter > 0; counter--) {
         System.out.println(counter);
      }
      scanner.close();
   }
}