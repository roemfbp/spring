package roem.springframework.didemo.examplebeans;

/**
 * Created by roem on  04/12/19
 */
public class FakeJmsBroker {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String username;
    private String password;
    private String url;


}