import java.util.Scanner;

public class io{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use a loop to process the input until there's no more input
        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();

            // Format and print the output using printf
            System.out.printf("%-15s%03d\n", str, num);
        }
        
        scanner.close();
    }
}
