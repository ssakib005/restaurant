package models;


public class UserLogin {
    public String userName;
    public String userPass;

    public UserLogin(String name, String pass) {
        userName = name;
        userPass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
