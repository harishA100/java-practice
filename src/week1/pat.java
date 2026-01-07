import java.util.*;
class pat{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n= sc.nextInt();
        for(int row=1;row<=(n*2)-1;row++){
            int rowchange = n>=row?n-row:row-n;
            for(int space =1;space<=rowchange;space++){
                System.out.print(" ");
            }
            int rowc = n>=row?(row*2)-1:(n*2)-((row-n)*2)-1;

            for(int col =1;col<=rowc;col++){

                if(col ==1 || col==rowc){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
            
            }

            System.out.println();
            
        }
    }
}