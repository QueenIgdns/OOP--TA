package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public abstract class AbstractUser implements User {
    protected String username;
    protected String password;

    public AbstractUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println(username + " logged out.");
    }

    // Force subclasses to implement getRole
    @Override
    public abstract String getRole();
}
