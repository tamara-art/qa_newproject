package phonebookframeworklesson16.model;

public class UserLesson16 {

    String email;
    String pwd;

    public UserLesson16() {
    }

    public UserLesson16(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public UserLesson16 setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public UserLesson16 setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

}
