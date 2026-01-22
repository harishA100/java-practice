import java.util.*;
class pat4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int num =1 ;num<=row;num++){
                System.out.print(num);
            }
            for(int num =n-1;num>0;num--){
                System.out.print(num);
            }
        System.out.println();
        }
    }
}
