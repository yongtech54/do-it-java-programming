package src.ch14;

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException{
        if (userID == null) {
            throw new IDFormatException("아이디가 비어있습니다.");
        }
        else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디 길이가 맞지 않습니다.");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userID = null;

        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e);
        }

        userID = "1234567";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "rightID123";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e);
        }
    }

}
