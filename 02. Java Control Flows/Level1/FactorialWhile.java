import java.util.Scanner;
public class FactorialWhile {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter num");
      int number = scanner.nextInt();
      long factorial = 1;
      if (number >= 0) {
         int tempNumber = number;
         while (tempNumber != 0) {
            factorial *= tempNumber;
            tempNumber--;
         }
         System.out.println(factorial);
      }
      scanner.close();
   }
}