import java.util.*;
class gcd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a number 'a' : ");
        int a=sc.nextInt();
        System.out.print(" Enter a number 'b' : ");
        int b=sc.nextInt();
        while(a!=0){
            int temp =a;
            a=b%a;
            b=temp;
        }
         System.out.print("The gcd is : "+ b);
    }
}