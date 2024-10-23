package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    public String getUsername() {
        return username;
    }

    private String username;
    public LogoutInputData(String username) {
        this.username=username;

    }

}
