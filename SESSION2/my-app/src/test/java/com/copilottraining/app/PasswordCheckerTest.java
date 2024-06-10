package com.copilottraining.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PasswordCheckerTest {

    private PasswordChecker passwordChecker;

    @BeforeEach
    public void setUp() {
        passwordChecker = new PasswordChecker();
    }

    @Test
    public void testCheckPassword_ValidPassword() {
        boolean result = passwordChecker.checkPassword("Abcdefg1!");
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckPassword_TooShortPassword() {
        boolean result = passwordChecker.checkPassword("Abc1!");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckPassword_TooLongPassword() {
        boolean result = passwordChecker.checkPassword("Abcdefg1234567890!@#$%^&*");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckPassword_NoLowercaseLetter() {
        boolean result = passwordChecker.checkPassword("ABCDEFG1!");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckPassword_NoUppercaseLetter() {
        boolean result = passwordChecker.checkPassword("abcdefg1!");
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckPassword_NoSpecialCharacter() {
        boolean result = passwordChecker.checkPassword("Abcdefg123");
        Assertions.assertFalse(result);
    }

    // -------------------------------
    @Test
    public void testCheckPasswordAndThrowReason_ValidPassword() {
        Assertions.assertDoesNotThrow(() -> passwordChecker.checkPasswordAndThrowReason("Abcdefg1!"));
    }

    @Test
    public void testCheckPassword_ValidPasswordWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("Abcdefg1!");
        } catch (Exception e) {
            Assertions.fail("No exception should be thrown for a valid password");
        }
    }

    @Test
    public void testCheckPassword_TooShortPasswordWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("Abc1!");
            Assertions.fail("Exception should be thrown for a too short password");
        } catch (Exception e) {
            Assertions.assertEquals("Password must be at least 8 characters long", e.getMessage());
        }
    }

    @Test
    public void testCheckPassword_TooLongPasswordWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("Abcdefg1234567890!@#$%^&*");
            Assertions.fail("Exception should be thrown for a too long password");
        } catch (Exception e) {
            Assertions.assertEquals("Password must not exceed 20 characters", e.getMessage());
        }
    }

    @Test
    public void testCheckPassword_NoLowercaseLetterWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("ABCDEFG1!");
            Assertions.fail("Exception should be thrown for no lowercase letter");
        } catch (Exception e) {
            Assertions.assertEquals("Password must contain at least one lowercase letter", e.getMessage());
        }
    }

    @Test
    public void testCheckPassword_NoUppercaseLetterWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("abcdefg1!");
            Assertions.fail("Exception should be thrown for no uppercase letter");
        } catch (Exception e) {
            Assertions.assertEquals("Password must contain at least one uppercase letter", e.getMessage());
        }
    }

    @Test
    public void testCheckPassword_NoSpecialCharacterWithErrorMessage() {
        try {
            passwordChecker.checkPasswordAndThrowReason("Abcdefg123");
            Assertions.fail("Exception should be thrown for no special character");
        } catch (Exception e) {
            Assertions.assertEquals("Password must contain at least one special character", e.getMessage());
        }
    }

}