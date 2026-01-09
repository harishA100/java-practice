import java.util.*;
class pat3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int row=1;row<=n*2;row++){
            int rowchange =n>=row?row:(n*2)-(row-1);
            for(int col=1;col<=n*2;col++){
                if(col<=(n-rowchange)+1||col>n+(rowchange-1)){
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
