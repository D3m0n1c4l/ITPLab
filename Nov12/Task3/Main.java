import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void saveImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl); // Check if URL is well-formed
            String fileName = url.getFile();
            String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));
            System.out.println("Saving to: " + destName);

            InputStream is = null;
            OutputStream os = null;

            try {
                is = url.openStream();
                os = new FileOutputStream(destName);

                byte[] buffer = new byte[2048];
                int length;

                while ((length = is.read(buffer)) != -1) {
                    os.write(buffer, 0, length);
                }

                System.out.println("Image saved successfully.");

            } catch (FileNotFoundException e) {
                System.err.println("File not found or cannot be created: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error reading or writing data: " + e.getMessage());
            } finally {
                // Close resources in finally block to ensure they are closed even if an exception occurs
                try {
                    if (is != null) is.close();
                } catch (IOException e) {
                    System.err.println("Failed to close InputStream: " + e.getMessage());
                }
                try {
                    if (os != null) os.close();
                } catch (IOException e) {
                    System.err.println("Failed to close OutputStream: " + e.getMessage());
                }
            }
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String url = "test";
        saveImage(url);
    }
}