import java.util.*;
class biexpo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        int ans= 1;
        while(exp>0){
            if(exp%2!=0){
                ans *=base;

            }
            
                base *=base;
                exp=exp/2;
        }
        System.out.print("The Answer is : " + ans);
    }
}
