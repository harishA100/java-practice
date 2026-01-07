import java.util.*;
class Tripat3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        for(int row=1;row<=n*2;row++){
            int rowchange = n>=row?row-1:n-(row-n);
            for(int space =1;space<=rowchange;space++){
                System.out.print(" ");
            }
            int row1=n>=row?n-(row-1):row-n;
            for(int star =1;star<=row1;star++){
                System.out.print("*"+" ");
        }
        System.out.println();
    }
}

}