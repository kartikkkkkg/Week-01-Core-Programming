import java.util.Scanner;

public class ArrayIndexDemo {
    public static void accessArray(String[] names, int index) {
        System.out.println(names[index]);
    }

    public static void handleArrayAccess(String[] names, int index) {
        try {
            accessArray(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();
        System.out.println("Calling accessArray...");
        try {
            accessArray(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\nCalling handleArrayAccess...");
        handleArrayAccess(names, index);
        scanner.close();
    }
}