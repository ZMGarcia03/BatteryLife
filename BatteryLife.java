import java.util.Scanner;

public class BatteryLife {
    private double capacity;

    public BatteryLife(double initialCapacity) {
        capacity = initialCapacity;
    }

    public void discharge(double usage) {
        capacity -= usage;
    }

    public void charge(double amount) {
        capacity += amount;
    }

    public double getPercentage(double maxCapacity) {
        return (capacity / maxCapacity) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial capacity of the battery: ");
        double initialCapacity = scanner.nextDouble();
        
        System.out.print("Enter maximum capacity of the battery: ");
        double maxCapacity = scanner.nextDouble();

        BatteryLife battery = new BatteryLife(initialCapacity);

        System.out.println("Battery Percentage: " + battery.getPercentage(maxCapacity));

        scanner.close();
    }
}
