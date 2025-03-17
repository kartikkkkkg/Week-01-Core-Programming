public class EarthVolume {
    public static void main(String[] args) {
        double earthRadiusKm = 6378;
        double pi = 3.14159265359;
        double volumeKm3 = (4.0 / 3.0) * pi * earthRadiusKm * earthRadiusKm * earthRadiusKm;
        double conversionFactor = 1.6;
        double volumeMiles3 = volumeKm3 * conversionFactor * conversionFactor * conversionFactor;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}