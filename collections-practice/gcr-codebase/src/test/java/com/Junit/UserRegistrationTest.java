package com.Junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
    UserRegistration reg = new UserRegistration();
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
            reg.registerUser("muskan", "muskan@gmail.com", "pass123")
        );
    }
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () ->
            reg.registerUser("", "muskan@gmail.com", "pass123")
        );
    }
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
            reg.registerUser("muskan", "muskan.com", "pass123")
        );
    }
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () ->
            reg.registerUser("muskan", "muskan@gmail.com", "123")
        );
    }
}
