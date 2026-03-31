package com.Junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();
    @Test
    void testValidDate() {
        assertEquals("31-01-2026", formatter.formatDate("2026-01-31"));
    }
    @Test
    void testInvalidDate() {
        assertThrows(Exception.class, () -> formatter.formatDate("31-01-2026"));
    }
}
