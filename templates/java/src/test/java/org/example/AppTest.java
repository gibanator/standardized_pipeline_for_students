package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test void adds() { 
        assertEquals(5, App.add(2,3)); 
    }
}