package com.json.json_q;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class JsonToXml {
    public static void main(String[] args) throws Exception {
        String json = "{ \"name\": \"Muskan Gupta\", \"age\": 22, \"city\": \"Agra\" }";
        // Read JSON
        ObjectMapper jsonMapper = new ObjectMapper();
        Object data = jsonMapper.readValue(json, Object.class);
        // Convert to XML
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(data);
        System.out.println(xml);
    }
}
