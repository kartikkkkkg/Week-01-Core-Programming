import java.util.Random;

public class FootballTeamHeightAnalyzer {
    public static int[] generateHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) sum += height;
        return sum;
    }

    public static double meanHeight(int sum, int count) {
        return (double) sum / count;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) shortest = Math.min(shortest, height);
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) tallest = Math.max(tallest, height);
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        int sum = sumHeights(heights);
        double mean = meanHeight(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Heights: " + java.util.Arrays.toString(heights));
        System.out.println("Total Height: " + sum + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}