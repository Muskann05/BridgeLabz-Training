package com.json.json_q;
import org.json.JSONArray;
import org.json.JSONObject;
public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Muskan Gupta");
        student.put("age", 22);
        JSONArray subjects = new JSONArray();
        subjects.put("Science");
        subjects.put("Mathematics");
        subjects.put("English");
        student.put("subjects", subjects);
        System.out.println(student.toString(2));
    }
}
