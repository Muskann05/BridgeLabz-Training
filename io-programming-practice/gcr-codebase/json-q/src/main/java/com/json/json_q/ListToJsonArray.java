package com.json.json_q;
import org.json.JSONArray;
import org.json.JSONObject;
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ListToJsonArray {
    public static void main(String[] args) {
        Student s1 = new Student("Muskan", 22);
        Student s2 = new Student("Mskn", 21);
        JSONArray studentsArray = new JSONArray();
        JSONObject obj1 = new JSONObject();
        obj1.put("name", s1.name);
        obj1.put("age", s1.age);
        JSONObject obj2 = new JSONObject();
        obj2.put("name", s2.name);
        obj2.put("age", s2.age);
        studentsArray.put(obj1);
        studentsArray.put(obj2);
        System.out.println(studentsArray.toString(2));
    }
}
