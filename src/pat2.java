import java.util.*;
class pat2{
    public static void main(String[] args){
        int n=4;
        for(int row=1;row<=(n*2)-1;row++){
            int rowc= n>=row?row:(n*2)-row;
            for(int star=1;star<=rowc;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}