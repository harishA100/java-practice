import java.util.*;
class Trispace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(row*2)-1;star++){
                if(star==1||star==(row*2)-1||row==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
