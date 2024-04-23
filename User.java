public class User {
    private String userid;
    private String password;
    private String email;
    private String usertype;

    public  void CreateUser(String userid, String password, String email,String usertype){
        this.userid= userid;
        this.password= password;
        this.email=email;
        this.usertype= usertype;

    }
    public User(String userid, String password, String email, String usertype) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
    }


    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsertype() {
        return usertype;
    }
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    public void resetPassword(String newPassword){
        this.password= newPassword;
    }

}

