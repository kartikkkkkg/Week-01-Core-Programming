import java.util.Scanner;
public class RocketCountdownWhile {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter number");
      int counter = scanner.nextInt();
      while (counter != 0) {
         System.out.println(counter);
         counter--;
      }
      scanner.close();
   }
}