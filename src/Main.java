//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("GLE", "Mercedes", 2020, 350_000, "white", 5);
        System.out.println("Initial state:");
        System.out.println(car.toString());

        car.sell();

        System.out.println("\nAfter sell():");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("black");
        car.setPrice(330_000);
        car.setYear(2023);
        car.delivery();

        System.out.println("\nAfter setters and delivery():");
        System.out.println(car);
    }
}