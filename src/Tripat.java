import java.util.*;
class Tripat{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int i=1;i<=n-row;i++)
            {
                System.out.print(" ");
                
            }
            for(int i=1;i<=row; i++){
                System.out.print("*");
            }
            for(int i=1;i<=row-1;i++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}