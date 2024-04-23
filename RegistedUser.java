import java.util.ArrayList;

public class RegistedUser {
    private ArrayList<User> listOfUsers = new ArrayList<User>();

    public void addUser(User newUser) {
        this.listOfUsers.add(newUser);
    }

    public void removeUser(User user){
        for (User e: this.listOfUsers){
            if (e.getUserid().equals(user.getUserid())){
                this.listOfUsers.remove(user);
                return;
            }
        }
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

}
