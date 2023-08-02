import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance:");
        Double distance = Double.parseDouble(scanner.nextLine());
        PublicTransport publicTransport = new PublicTransport(distance);
        publicTransport.printInfo();
    }
}