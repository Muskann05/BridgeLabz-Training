package com.json.json_q.car;
import org.json.JSONObject;
public class CarToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        JSONObject carJson = new JSONObject();
        carJson.put("brand", car.brand);
        carJson.put("model", car.model);
        carJson.put("year", car.year);
        System.out.println(carJson.toString(2));
    }
}
