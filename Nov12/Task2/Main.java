import java.io.*;


public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("src/input.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);

            StringBuilder modified_buffer = new StringBuilder(buffer.length);
            for (byte b : buffer) {
                modified_buffer.append((char) b);
            }

            String[] values = modified_buffer.toString().split(" ");

            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            System.out.println(a / b);
        }

        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}