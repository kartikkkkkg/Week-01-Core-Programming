import java.util.Scanner;

public class ChocolateDivider {
    public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
        return new int[]{numberOfChocolates / numberOfChildren, numberOfChocolates % numberOfChildren};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        if (numberOfChocolates < 0) {
            System.out.println("Invalid number of chocolates.");
            System.exit(0);
        }

        System.out.println("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren <= 0) {
            System.out.println("Invalid number of children.");
            System.exit(0);
        }

        int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("The number of chocolates each child gets is " + result[0] +
                " and the number of remaining chocolates are " + result[1]);

        scanner.close();
    }
}