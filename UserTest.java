public class UserTest {

//---------------------------------------------------------------------------

    public void setUserNameTest() {
        User u = new User("shani", "shani11");
        u.setUserName("Mr. ABC");

        if (u.getUserName().equalsIgnoreCase("Mr. ABC")) {
            System.out.println("\n    setUserNameTest - PASS");
        } else {
            System.out.println("    setUserNameTest - FAIL");
        }
    }

    public void setIncorrectUserNameTest() {
        User u = new User();
        u.setUserName(" ");

        if (u.getUserName().equalsIgnoreCase(" ")) {
            System.out.println("    setIncorrectUserNameTest - PASS");
        } else {
            System.out.println("    setIncorrectUserNameTest - FAIL");
        }
    }

    public void getUserNameTest(){
        User u = new User("shani", "shani11");

        if (u.getUserName().equalsIgnoreCase("shani")) {
            System.out.println("    getUserNameTest - PASS");
        }
        else {
            System.out.println("    getUserNameTest - FAIL");
        }

    }

//---------------------------------------------------------------------------

    public void setUserIdTest() {
        User u = new User();
        u.setUserId("101010");

        if (u.getUserId().equalsIgnoreCase("101010")) {
            System.out.println("    setUserIdTest - PASS");
        }
        else {
            System.out.println("    setUserIdest - FAIL");
        }
    }

    public void setIncorrectUserIdTest() {
        User u = new User();
        u.setUserId(" ");

        if (u.getUserId().equalsIgnoreCase(" ")) {
            System.out.println("    setIncorrectUserIdTest - PASS");
        } else {
            System.out.println("    setIncorrectUserIdTest - FAIL");
        }
    }

    public void getUserIdTest(){
        User u = new User("101010");

        if (u.getUserId().equalsIgnoreCase("101010")) {
            System.out.println("    getUserIdTest - PASS");
        }
        else {
            System.out.println("    getUserIdTest - FAIL");
        }
    }
    //---------------------------------------------------------------------------

    public void setTeamNameTest(){
        User u = new User("shani", "CSK");
        if(u.getTeamName().equals("CSK")){
            System.out.println("    setTeamNameTest - PASS");
        }
        else{
            System.out.println("    setTeamNameTest - Fail");
        }
    }

    public void setIncorrectTeamNameTest(){
        User u = new User("shani", "");

        if(u.getTeamName().equalsIgnoreCase("")){
            System.out.println("    setIncorrectTeamNameTest - PASS");
        }
        else{
            System.out.println("    setIncorrectTeamNameTest - Fail");
        }

    }

    public void getTeamNameTest(){
        User u = new User("shani", "shani11");

        if(u.getTeamName().equalsIgnoreCase("shani11")){
            System.out.println("    getTeamNameTest - PASS");
        }
        else {
            System.out.println("    getTeamNameTest - FAIL");
        }
    }
    //---------------------------------------------------------------------------

    public void setCreditTest(){
        User u = new User();
        u.setCredit(10);

        if(u.getCredit()==10){
            System.out.println("    setCreditTest - PASS");
        }
        else{
            System.out.println("    setCreditTest - FALSE");
        }
    }

    public void setIncorrectCreditTest(){
        User u = new User();
        u.setCredit(110);

        if(u.getCredit()<0 || u.getCredit()>100){
            System.out.println("    setIncorrectCreditTest - PASS");
        }
        else{
            System.out.println("    setIncorrectCreditTest - FALSE");
        }
    }

    public void getCreditTest(){
        User u = new User(99,101);

        if(u.getCredit()==99){
            System.out.println("    getCreditTest - PASS");
        }
        else{
            System.out.println("    getCreditTest - FAIL");
        }
    }
    //---------------------------------------------------------------------------

    public void setPointTest(){
        User u = new User();
        u.setPoints(110);

        if(u.getPoints()==110){
            System.out.println("    setPointTest - PASS");
        }
        else{
            System.out.println("    setPointTest - FALSE");
        }
    }

    public void setIncorrectPointTest(){
        User u = new User();
        u.setPoints(1100);

        if(u.getPoints()<0 || u.getPoints()>150){
            System.out.println("    setIncorrectPointTest - PASS");
        }
        else{
            System.out.println("    setIncorrectPointTest - FALSE");
        }
    }

    public void getPointsTest(){
        User u = new User(11,120);

        if(u.getPoints()==120){
            System.out.println("    getPointTest - PASS");
        }
        else {
            System.out.println("    getPointTest - FAIL");
        }
    }
    //---------------------------------------------------------------------------

    public void createUserSuccessTest(){
        User u = new User("shani","shani11");
        IUser.status is = u.createUser(new UserMockDB());
        if(IUser.status.SUCCESS == is){
            System.out.println("    createUserSuccessTest - PASS");
        }
        else{
            System.out.println("    createUserSuccessTest- FAIL");
        }
    }

    public void createIncorrectUserTest(){
        User u = new User("","shani11");
        IUser.status is = u.createUser(new UserMockDB());
        if(IUser.status.FAILURE == is){
            System.out.println("    createIncorrectUserTest - PASS");
        }
        else {
            System.out.println("    createIncorrectUserTest - FAIL");

        }


    }



}
