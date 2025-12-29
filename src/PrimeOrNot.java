import java.util.*;
class PrimeOrNot{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n = sc.nextInt();
        if(n!=1){
        for(int i=2;i<=9 ;i++){
            
                if(n%i==0){
                    System.out.println("Not a prime number");
                    break;
                }
                else{
                    System.out.println("It's an prime number");
                    break;
                }
        }
        }
        else{
            System.out.println("It's not an prime number");
        }
    }
}
