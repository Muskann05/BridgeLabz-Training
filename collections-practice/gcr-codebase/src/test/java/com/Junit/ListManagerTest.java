package com.Junit;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
class ListManagerTest {
    ListManager manager = new ListManager();
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }
    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>(List.of(10, 20));
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }
    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        assertEquals(3, manager.getSize(list));
    }
}
