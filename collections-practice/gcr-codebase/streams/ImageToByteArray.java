import java.io.*;
public class ImageToByteArray {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("rose.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }
            byte[] imageBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream("copy.jpg");

            while ((data = bais.read()) != -1) {
                fos.write(data);
            }
            System.out.println("Image copied successfully.");
            fis.close();
            baos.close();
            bais.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
