import java.util.Objects;

enum Drinks {
    Coke ("Coke", 5.0),
    Sprite ("Sprite", 4.0),
    Fanta ("Fanta", 5.0);

    public final String name;
    public final double price;

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + "$";
    }
}

enum Money {
    ONE_DOLLAR(1), TWO_DOLLARS(2), FIVE_DOLLARS(5), TEN_DOLLARS(10),
    TWENTY_FIVE_DOLLARS(25), FIFTY_DOLLARS(50), ONE_HUNDRED_DOLLARS(100);

    public final int denomination;

    Money(int denomination) {
        this.denomination = denomination;
    }
}

public class VendingMachine {
    void getMenu() {
        System.out.println(Drinks.Coke);
        System.out.println(Drinks.Sprite);
        System.out.println(Drinks.Fanta);
    }

    void execute(double cash, String drink_name) {
        if (cash < 0) {
            System.out.println("Negative cash");
        } else {
            if (Objects.equals(drink_name, "Coke")) {
                if (cash < Drinks.Coke.price) {
                    System.out.println("Invalid cash");
                } else if (Objects.equals(cash, Drinks.Coke.price)) {
                    System.out.println("Successfully purchased Coke!");
                } else {
                    System.out.println("Successfully purchased Coke!");
                    double difference = Math.floor(cash - Drinks.Coke.price);
                    System.out.println("Returning " + difference + "$...");
                }
            } else if (Objects.equals(drink_name, "Sprite")) {
                if (cash < Drinks.Sprite.price) {
                    System.out.println("Invalid cash");
                } else if (Objects.equals(cash, Drinks.Sprite.price)) {
                    System.out.println("Successfully purchased Sprite!");
                } else {
                    System.out.println("Successfully purchased Sprite!");
                    double difference = Math.floor(cash - Drinks.Sprite.price);
                    System.out.println("Returning " + difference + "$...");
                }
            } else if (Objects.equals(drink_name, "Fanta")) {
                if (cash < Drinks.Fanta.price) {
                    System.out.println("Invalid cash");
                } else if (Objects.equals(cash, Drinks.Fanta.price)) {
                    System.out.println("Successfully purchased Fanta!");
                } else {
                    System.out.println("Successfully purchased Fanta!");
                    double difference = Math.floor(cash - Drinks.Fanta.price);
                    System.out.println("Returning " + difference + "$...");
                }
            } else {
                System.out.println("Unknown drink requested");
            }
        }
    }
}