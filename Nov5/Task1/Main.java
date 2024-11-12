import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getMenu();

        Scanner scanner = new Scanner(System.in);
        double cash = scanner.nextDouble();
        String drink = scanner.next();
        vendingMachine.execute(cash, drink);
    }
}