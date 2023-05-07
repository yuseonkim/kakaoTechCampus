package Chapter6.ch10;

public class PasswordTest {


    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {

        if(password==null){
            throw new PasswordException("비밀번호는 null X");
        }else if(password.length()<5){
            throw new PasswordException("비밀번호는 다섯 자 이상입니다");
        }else if(password.matches("[a-zA-z]+")){
            throw new PasswordException("비밀번호는 특수문자나 숫자를 포함해야합니다");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        String password = null;
        try{
            test.setPassword(password);
            System.out.println("오류없음1");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }
        password ="abbccdd";
        try{
            test.setPassword(password);
            System.out.println("오류없음2");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password ="abc";
        try{
            test.setPassword(password);
            System.out.println("오류없음3");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password ="abcde1";
        try{
            test.setPassword(password);
            System.out.println("오류없음4");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

    }
}
