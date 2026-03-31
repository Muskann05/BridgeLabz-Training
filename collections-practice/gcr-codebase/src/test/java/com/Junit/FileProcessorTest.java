package com.Junit;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
class FileProcessorTest {
    FileProcessor processor = new FileProcessor();
    String filename = "test.txt";
    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello JUnit");
        String content = processor.readFromFile(filename);
        assertEquals("Hello JUnit", content);
    }
    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test");
        File file = new File(filename);
        assertTrue(file.exists());
    }
    @Test
    void testReadFileNotFound() {
        assertThrows(IOException.class, () -> processor.readFromFile("nofile.txt"));
    }
}
