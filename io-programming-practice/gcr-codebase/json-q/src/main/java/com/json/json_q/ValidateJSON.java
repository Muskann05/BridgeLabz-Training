package com.json.json_q;
import org.json.JSONObject;
public class ValidateJSON {
    public static void main(String[] args) {
        String json = "{\"name\":\"Muskan\",\"age\":22}";
        try {
            new JSONObject(json);
            System.out.println("JSON is valid");
        } catch(Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
