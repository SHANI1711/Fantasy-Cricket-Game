import java.util.UUID;
public class User {
    private String userName;
    private String userId=UUID.randomUUID().toString();
    private String teamName;
    private int credit=100;
    private int points=0;

    // Constructors
    public User(String userName, String teamName){
        this.userName = userName;
        this.teamName = teamName;
    }
    public User(String userId){
        this.userId= userId;
    }
    public User(int credit, int points){
        this.credit=credit;
        this.points=points;
    }
    public User(){
    }
    //---------------------------------------------------------------------------

    public IUser.status createUser(IUser iUser){
        return iUser.addUser(userName, teamName);
    }
    //---------------------------------------------------------------------------

    //initializing values of variables with setters and getters

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        if(!userName.equals("")){
            this.userName = userName;
        }
    }
    //===========================
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        if(userId != null){
            this.userId = userId;
        }
    }
    //===========================
    public void setTeamName(String teamName) {

        if(!teamName.equalsIgnoreCase("")){
            this.teamName = teamName;
        }
    }
    public String getTeamName() {
        return teamName;
    }
    //===========================
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
            this.credit = credit;
    }
    //===========================
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
            this.points = points;

    }
}
