import java.util.Scanner;

public class NumberFactorsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        if (inputNumber > 0) {
            for (int divisor = 1; divisor <= inputNumber; divisor++) {
                if (inputNumber % divisor == 0) {
                    System.out.println(divisor);
                }
            }
        }
        
        scanner.close();
    }
}
</xai Artifact>

---

### Program 8: Factors of a Number (While Loop)
<xaiArtifact artifact_id="c79f3e67-155d-465d-83b3-c4ac6cdb40dd" artifact_version_id="ea0ce721-f07d-4169-a81e-63a82078478e" title="NumberFactorsWhile.java" contentType="text/x-java-source">
import java.util.Scanner;

public class NumberFactorsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int divisor = 1;
        
        if (inputNumber > 0) {
            while (divisor <= inputNumber) {
                if (inputNumber % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            }
        }
        
        scanner.close();
    }
}