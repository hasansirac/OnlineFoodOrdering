/**
 * Represents a base user entity in the system.
 * Handles basic user data like username and password authentication.
 */
public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        System.out.println(username + " logged in successfully.");
        return true;
    }

    public String getUsername() {
        return username;
    }
}
