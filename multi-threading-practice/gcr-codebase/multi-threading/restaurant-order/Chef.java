public class Chef extends Thread {
    private String dish;
    private int cookingTime; 
    public Chef(String name, String dish, int cookingTime) {
        super(name);
        this.dish = dish;
        this.cookingTime = cookingTime;
    }
    public void run() {
        System.out.println(getName() + " started preparing " + dish);
        int[] progressPoints = {25, 50, 75, 100};
        for(int progress : progressPoints) {
            try {
                Thread.sleep(cookingTime / 4); 
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " preparing " + dish + ": " + progress + "% complete");
        }
        System.out.println(getName() + " completed " + dish);
    }
}