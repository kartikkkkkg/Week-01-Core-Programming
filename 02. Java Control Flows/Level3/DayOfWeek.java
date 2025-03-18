import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1582) {
            if (month < 3) {
                month += 12;
                year--;
            }
            int k = year % 100;
            int j = year / 100;
            int h = (day + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;
            int dayOfWeek = ((h + 5) % 7) + 1;
            
            System.out.println(dayOfWeek);
        } else {
            System.out.println("Invalid date");
        }
        
        scanner.close();
    }
}