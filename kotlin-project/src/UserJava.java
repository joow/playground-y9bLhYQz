public class UserJava {
    private String email;
    private String password;

    public UserJava(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public UserJava setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserJava setPassword(String password) {
        this.password = password;
        return this;
    }
}
