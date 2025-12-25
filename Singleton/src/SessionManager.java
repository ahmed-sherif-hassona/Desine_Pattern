import java.util.ArrayList;
import java.util.List;

public class SessionManager {

    // The single instance of the class
    private static SessionManager instance = null;

    // List to store currently logged-in users
    private List<String> loggedInUsers;

    // Private constructor to prevent external instantiation
    private SessionManager() {
        loggedInUsers = new ArrayList<>();
    }

    // Public method to provide access to the single instance
    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    // Method to log in a user
    public void login(String username) {
        if (!loggedInUsers.contains(username)) {
            loggedInUsers.add(username);
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println(username + " is already logged in.");
        }
    }

    // Method to log out a user
    public void logout(String username) {
        if (loggedInUsers.contains(username)) {
            loggedInUsers.remove(username);
            System.out.println(username + " logged out successfully.");
        } else {
            System.out.println(username + " is not logged in.");
        }
    }

    // Method to display all currently logged-in users
    public void showLoggedInUsers() {
        System.out.println("Currently logged in users: " + loggedInUsers);
    }
}
