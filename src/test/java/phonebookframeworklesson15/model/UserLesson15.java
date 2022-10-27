package phonebookframeworklesson15.model;

public class UserLesson15 {

    String email;
    String pwd;

    public UserLesson15() {
    }

    public UserLesson15(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public UserLesson15 setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public UserLesson15 setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

}
