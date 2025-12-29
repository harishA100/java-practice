import java.util.*;
class Gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int result = gcd(a,b);
        System.out.println("The Gcd is : "+result);
    }
    public static int gcd(int a, int b){

        if(b==0){
            return a;
        }
        
        return gcd(b,a%b);
        
    }
}
