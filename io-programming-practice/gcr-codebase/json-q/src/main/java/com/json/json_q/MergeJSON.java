package com.json.json_q;
import org.json.JSONObject;
public class MergeJSON {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        json1.put("name", "Muskan");
        json1.put("age", 22);
        JSONObject json2 = new JSONObject();
        json2.put("email", "muskan@email.com");
        json2.put("city", "Agra");
        // Merge
        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }
        System.out.println(json1.toString(2));
    }
}

