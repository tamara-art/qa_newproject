package phonebookframeworklesson14;

public class UserLesson14 {

    String email;
    String pwd;

    public UserLesson14() {
    }

    public UserLesson14(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public UserLesson14 setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public UserLesson14 setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

}
