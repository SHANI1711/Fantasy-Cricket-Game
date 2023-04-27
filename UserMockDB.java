import java.util.ArrayList;

public class UserMockDB implements IUser{
//    ArrayList
    ArrayList<User> user = new ArrayList<>();
    public status addUser(String userName, String teamName){
        if(userName.equalsIgnoreCase("" ) || teamName.equalsIgnoreCase("")){
            return status.FAILURE;
        }
        else {
            return status.SUCCESS;
        }
    }

    public UserMockDB(){
        mockUser();
    }

    private void mockUser(){
        user.add(new User("MUMBAI","MUMBAI INDIANS"));
        user.add(new User("RCB","ROYAL CHALLENGER BANGALORE"));
        user.add(new User("CHENNAI","CHENNAI SUPER KINGS"));
    }

}
