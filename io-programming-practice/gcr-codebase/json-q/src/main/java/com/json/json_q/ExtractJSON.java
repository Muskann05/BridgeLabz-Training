package com.json.json_q;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ExtractJSON {
    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("C:\\json-q\\src\\main\\java\\com\\json\\json_q\\users.json")));
        JSONArray users = new JSONArray(content);
        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            System.out.println("Name: " + user.getString("name"));
            System.out.println("Email: " + user.getString("email"));
        }
    }
}

