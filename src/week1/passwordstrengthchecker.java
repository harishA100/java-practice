import java.util.Scanner;
public class passwordstrengthchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        boolean hasdigit =false;
        for(int i=0;i<password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch)){
                hasdigit=true;
            }
        }
        if(password.length()>=8 && hasdigit){
            System.out.println("password is valid");
        }
        else{
            System.out.println("Password is not valid");
        }
    }
}