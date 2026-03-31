import java.util.Random;
public class FileDownloaderRunnable implements Runnable {
    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading " 
                                + fileName + ": " + progress + "%");
            try {
                Thread.sleep(500 + random.nextInt(1000)); 
            } catch (InterruptedException e) {
                System.out.println("Download interrupted: " + fileName);
            }
        }
    }
}