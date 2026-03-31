package com.json.json_q;
import org.json.JSONArray;
import org.json.JSONObject;
public class DBToJson {
    public static void main(String[] args) {
        JSONArray report = new JSONArray();
        JSONObject student1 = new JSONObject();
        student1.put("id", 1);
        student1.put("name", "Alice");
        student1.put("email", "alice@example.com");
        student1.put("age", 25);

        JSONObject student2 = new JSONObject();
        student2.put("id", 2);
        student2.put("name", "Bob");
        student2.put("email", "bob@example.com");
        student2.put("age", 30);

        report.put(student1);
        report.put(student2);

        System.out.println(report.toString(2));
    }
}
