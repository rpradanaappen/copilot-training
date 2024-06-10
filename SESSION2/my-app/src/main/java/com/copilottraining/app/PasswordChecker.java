package com.copilottraining.app;

public class PasswordChecker {
    
    /**
     * Checks if a password meets the specified criteria.
     * 
     * @param password the password to be checked
     * @return true if the password meets the criteria, false otherwise
     */
    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.length() > 20) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }
        return true;
    }

    /**
     * Checks if the given password meets the specified criteria and throws an exception with the reason if it doesn't.
     *
     * @param password the password to be checked
     * @return true if the password meets the criteria
     * @throws Exception if the password doesn't meet the criteria
     */
    public void checkPasswordAndThrowReason(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long");
        }
        if (password.length() > 20) {
            throw new Exception("Password must not exceed 20 characters");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("Password must contain at least one lowercase letter");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Password must contain at least one uppercase letter");
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new Exception("Password must contain at least one special character");
        }
    }
}