import java.io.*;
public class BufferedVsUnbuffered {
    public static void main(String[] args) throws IOException {
        File source = new File("largeFile.txt");
        File dest1 = new File("normalCopy.txt");
        File dest2 = new File("bufferedCopy.txt");
        // Unbuffered
        long start1 = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest1)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        long end1 = System.nanoTime();
        // Buffered
        long start2 = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long end2 = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end1 - start1) + " ns");
        System.out.println("Buffered Time: " + (end2 - start2) + " ns");
    }
}
