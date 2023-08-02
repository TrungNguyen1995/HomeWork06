import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance:");
        Double distance = Double.parseDouble(scanner.nextLine());
        System.out.println("Speed and ArrivalTime Bus");
        Bus bus = new Bus(distance);
        bus.printInfo();
        System.out.println("Speed and ArrivalTime Train");
        Train train = new Train(distance);
        train.printInfo();
        System.out.println("Speed and ArrivalTime Plane");
        Plane plane =new Plane(distance);
        plane.printInfo();
    }
}