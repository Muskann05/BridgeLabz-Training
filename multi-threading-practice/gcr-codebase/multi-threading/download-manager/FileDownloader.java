import java.util.Random;

public class FileDownloader extends Thread {
    private String fileName;
    private Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + progress + "%");
            try {
                Thread.sleep(500 + random.nextInt(1000)); 
            } catch (InterruptedException e) {
                System.out.println("Download interrupted: " + fileName);
            }
        }
    }
}