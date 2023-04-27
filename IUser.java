public interface IUser {
public static enum status{
    SUCCESS,
    FAILURE
}
public status addUser(String userName, String teamName);
}
