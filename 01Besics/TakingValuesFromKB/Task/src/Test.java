import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        // Using Scanner
        System.out.print("Enter data using Scanner: ");
        String scannerInput = new java.util.Scanner(System.in).nextLine();
        System.out.println("Scanner Input: " + scannerInput);

        // Using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter data using BufferedReader: ");
        String bufferedReaderInput = reader.readLine();
        System.out.println("BufferedReader Input: " + bufferedReaderInput);

        // Using Command-line Arguments
        if (args.length > 0) {
            System.out.println("Command-line Argument: " + args[0]);
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}