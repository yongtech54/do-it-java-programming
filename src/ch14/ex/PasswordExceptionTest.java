package src.ch14.ex;

public class PasswordExceptionTest {
    private String password;

    public void setPassword(String password) throws PasswordException{
        if (password == null) {
            throw new PasswordException("패스워드가 null입니다.");
        }
        else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야합니다.");
        }
        else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자열로만 이루어져야합니다.");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        String password = "abc";
        PasswordExceptionTest test = new PasswordExceptionTest();

        try {
            test.setPassword(password);
            System.out.println("에러 없음 1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcdefg";
        try {
            test.setPassword(password);
            System.out.println("에러 없음 2");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "dfe123";
        try {
            test.setPassword(password);
            System.out.println("에러 없음 3");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
