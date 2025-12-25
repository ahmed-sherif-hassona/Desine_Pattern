public class Main {
    public static void main(String[] args) {
        // Get the single instance of SessionManager
        SessionManager session1 = SessionManager.getInstance();
        SessionManager session2 = SessionManager.getInstance();

        // Log in users
        session1.login("Ahmed");
        session1.login("Sara");
        session2.login("Ahmed"); // Same instance, duplicate login is prevented

        // Display logged-in users
        session1.showLoggedInUsers(); // session1 and session2 share the same data

        // Log out a user
        session2.logout("Sara");
        session1.showLoggedInUsers(); // Changes are reflected in session1 as well
    }
}
