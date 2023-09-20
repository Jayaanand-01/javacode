
    import java.util.Scanner;

    public class Neon_numbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            int square = n * n;
            if (isNeonNumber(square, n)) {
                System.out.println(n + " is a neon number");
            } else {
                System.out.println(n + " is not a neon number");
            }
        }
        private static boolean isNeonNumber(int square, int number) {
            if (square == 0) {
                return number == 0;
            } else {
                int digit = square % 10;
                return isNeonNumber(square / 10, number - digit);
            }
        }
    }
