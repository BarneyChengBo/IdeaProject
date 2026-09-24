package exerciseInClassTDD1;

public class User {

    private String userName;
    private String passWord;
    private String typeOfUser;


    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.typeOfUser = "normal";

    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return passWord;
    }

    public void setUserName(String newUserName) {
        if(newUserName.length() >= 4 ){
            this.userName = newUserName;
        }


    }

    public void setPassword(String newPassword) {
        if (20 >= newPassword.length() && newPassword.length()  >= 7) {
            this.passWord = newPassword;
        }
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void SetTypeOfUser(String newUserType) {
        if ( newUserType == "normal" || newUserType == "admin" || newUserType == "super" ) {
            this.typeOfUser = newUserType;
        }
    }
}
