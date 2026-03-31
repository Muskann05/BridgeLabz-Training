import java.util.*;
public class Program {
    // Register creator
    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }
    // Get top post counts
    public Map<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for(CreatorStats creator : records) {
            int count = 0;
            for(double likes : creator.WeeklyLiKes) {
                if(likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(creator.CreatorName, count);
            }
        }
        return result;
    }
    // Calculate average likes
    public double CalculateAverageLikes() {
        double sum = 0;
        int totalWeeks = 0;
        for(CreatorStats creator : CreatorStats.EngagementBoard) {
            for(double likes : creator.WeeklyLiKes) {
                sum += likes;
                totalWeeks++;
            }
        }
        if (totalWeeks == 0) return 0;
        return sum / totalWeeks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program obj = new Program();
        int choice;
        do {
            System.out.println("\n1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    CreatorStats creator = new CreatorStats();
                    System.out.print("Enter Creator Name: ");
                    creator.CreatorName = sc.nextLine();
                    creator.WeeklyLiKes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");
                    for(int i = 0; i < 4; i++) {
                        creator.WeeklyLiKes[i] = sc.nextDouble();
                    }
                    obj.RegisterCreator(creator);
                    System.out.println("Creator registered successfully");
                    break;
                case 2:
                    System.out.print("Enter like threshold: ");
                    double threshold = sc.nextDouble();
                    Map<String, Integer> result =
                        obj.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);
                    if(result.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for(Map.Entry<String, Integer> entry : result.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;
                case 3:
                    double avg = obj.CalculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) avg);
                    break;
                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while(choice != 4);
        
    }
}
