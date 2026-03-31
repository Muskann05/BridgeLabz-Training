package com.json.json_q;
import org.json.JSONArray;
import org.json.JSONObject;
public class FilterJSON {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Muskan\",\"age\":22},{\"name\":\"Muskii\",\"age\":26}]";
        JSONArray array = new JSONArray(json);
        for (int i = 0; i < array.length(); i++) {
            JSONObject person = array.getJSONObject(i);
            if (person.getInt("age") > 25) {
                System.out.println(person.toString(2));
            }
        }
    }
}

