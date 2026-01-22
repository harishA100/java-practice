import java.util.*;
class Palindrome{
    static boolean palindrome(int n){
        int original=n;
        int reversed=0;
        
        while(n>0){
            int unit = n%10;
            reversed = reversed*10+unit;
            n/=10;
            
        }
        if(original==reversed){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean result = palindrome(n);
        if(result){
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}