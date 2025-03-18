import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amarAge = scanner.nextInt();
        int akbarAge = scanner.nextInt();
        int anthonyAge = scanner.nextInt();
        double amarHeight = scanner.nextDouble();
        double akbarHeight = scanner.nextDouble();
        double anthonyHeight = scanner.nextDouble();
        
        String youngestName = (amarAge <= akbarAge && amarAge <= anthonyAge) ? "Amar" :
                             (akbarAge <= anthonyAge) ? "Akbar" : "Anthony";
        
        String tallestName = (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) ? "Amar" :
                            (akbarHeight >= anthonyHeight) ? "Akbar" : "Anthony";
        
        System.out.println("Youngest is " + youngestName);
        System.out.println("Tallest is " + tallestName);
        
        scanner.close();
    }
}