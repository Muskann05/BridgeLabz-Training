package ipl;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.FileWriter;
public class IPLJson {
    public static void main(String[] args) throws Exception {
        // Read JSON file as String
        FileReader reader = new FileReader("C:\\json-q\\src\\main\\java\\ipl\\ipl.json");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        JSONArray matches = new JSONArray(sb.toString());
        JSONArray censoredMatches = new JSONArray();
        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);
            // Mask team names
            match.put("team1", maskTeam(match.getString("team1")));
            match.put("team2", maskTeam(match.getString("team2")));
            match.put("winner", maskTeam(match.getString("winner")));
            // Redact player of match
            match.put("player_of_match", "REDACTED");
            censoredMatches.put(match);
        }
        // Write censored JSON to file
        FileWriter writer = new FileWriter("C:\\json-q\\src\\main\\java\\ipl\\ipl_censored.json");
        writer.write(censoredMatches.toString(2));
        writer.close();
        System.out.println("✅ Censored JSON file created successfully!");
    }
    // Method to mask team names
    public static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }
}
