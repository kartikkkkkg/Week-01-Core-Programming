import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter traveler name: ");
        String name = scanner.nextLine();
        System.out.println("Enter from city: ");
        String fromCity = scanner.nextLine();
        System.out.println("Enter via city: ");
        String viaCity = scanner.nextLine();
        System.out.println("Enter to city: ");
        String toCity = scanner.nextLine();
        System.out.println("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = scanner.nextDouble();
        System.out.println("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = scanner.nextInt();
        System.out.println("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = scanner.nextDouble();
        System.out.println("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes");
    }
}