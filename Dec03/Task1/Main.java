import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static class UnderweightException extends Throwable {
        @Override
        public String getMessage() {
            return "[!] Status: Underweight.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] Enter the value: ");
        try {
            int value = Integer.parseInt(String.valueOf(scanner.nextInt()));
            if (value >= 20) {
                throw new UnderweightException();
            }
            System.out.println("[+] Value is " + value + ".");
        } catch (UnderweightException exception) {
            System.out.println(exception.getMessage());
        } catch (NumberFormatException | InputMismatchException exception) {
            System.out.println("[-] Bad number.");
        }
    }
}