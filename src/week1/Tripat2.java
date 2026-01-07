import java.util.*;
class Tripat2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
                int n=sc.nextInt();
        
        for(int row =1;row<=(n*2)-1;row++){ 
            int rowchange = n>=row?n-row : row-n;
            for(int space=1;space<=rowchange;space++){
                System.out.print(" ");
            }
            int rowc = n>=row?(row*2)-1:((n*2)-((row-n)*2)-1);
            for(int star=1;star<=rowc;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
