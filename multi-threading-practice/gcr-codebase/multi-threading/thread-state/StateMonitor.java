import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class StateMonitor extends Thread {
    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        while(!allTerminated) {
            allTerminated = true;

            for(Thread t : threads) {
                Thread.State state = t.getState();
                String name = t.getName();

                System.out.println("[Monitor] " + name + " is in " + state +
                        " state at " + LocalTime.now());

                stateCount.put(name, stateCount.getOrDefault(name, 0) + 1);

                if(state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500); 
            } catch(InterruptedException e) {
                System.out.println("Monitor interrupted.");
                break;
            }
        }

        // Summary
        System.out.println("\nSummary of state changes observed:");
        for (String name : stateCount.keySet()) {
            System.out.println(name + " went through " + stateCount.get(name) + " observations.");
        }
    }
}