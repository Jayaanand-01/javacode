import java.util.Scanner;

public class Solution_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print the top row of equal signs
        System.out.println("================================");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            if (parts.length == 2) {
                String str = parts[0];
                int num = Integer.parseInt(parts[1]);
                System.out.printf("%-15s%03d%n", str, num);
            }
        }

        // Print the bottom row of equal signs
        System.out.println("================================");

        scanner.close();
    }
}
