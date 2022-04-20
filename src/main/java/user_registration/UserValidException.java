package user_registration;

public class UserValidException extends Exception {
    public String message;

    public UserValidException(String message) {
        this.message = message;
    }
}