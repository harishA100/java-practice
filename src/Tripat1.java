import java.util.*;
class Tripat1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space = 1;space <=row-1;space++){
                System.out.print(" ");
            }
            for(int star =1;star<=(n*2)-(row*2-1);star++){
                System.out.print("0");
            }
        

            System.out.println();
        }

        
    }
}