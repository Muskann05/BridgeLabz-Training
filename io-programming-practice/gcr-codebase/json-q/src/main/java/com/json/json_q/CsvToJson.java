package com.json.json_q;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.util.List;
import java.util.Map;
public class CsvToJson {
    public static void main(String[] args) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        List<Map<String, String>> list = csvMapper
                .readerFor(Map.class)
                .with(schema)
                .<Map<String, String>>readValues(new File("C:\\json-q\\src\\main\\java\\com\\json\\json_q\\students.csv"))
                .readAll();
        ObjectMapper jsonMapper = new ObjectMapper();
        System.out.println(jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
    }
}

