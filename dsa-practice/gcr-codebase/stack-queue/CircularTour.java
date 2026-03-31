import java.util.LinkedList;
import java.util.Queue;

class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> q = new LinkedList<>();

        int start = 0, end = 0;
        int currPetrol = 0;

        while (q.size() < n) {

            currPetrol += petrol[end] - distance[end];
            q.offer(end);

            // If petrol becomes negative, remove from front
            while (currPetrol < 0 && !q.isEmpty()) {
                int removed = q.poll();
                currPetrol -= petrol[removed] - distance[removed];
                start = removed + 1;
            }

            end = (end + 1) % n;

            if (end == start)
                break;
        }

        return (q.size() == n) ? start : -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStart(petrol, distance);

        if (start == -1)
            System.out.println("No possible tour");
        else
            System.out.println("Start at petrol pump index: " + start);
    }
}
