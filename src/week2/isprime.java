import java.util.*;
class isprime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.print("It's not an prime number");
            
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.print("It's not an prime number");
                break;
            }

            else{
                System.out.print("It's an prime number");
                break;
            }
        
    }}

}
