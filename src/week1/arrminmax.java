import java.util.*;
class arrminmax{
    public static void main(String[] args){
        int arr[] ={3,5,3,6,4,8,6,9};
        int initial =arr[0];
        int final1 = arr[(arr.length)-1];
        for(int i=1;i<=arr.length-1;i++){
            if(initial>arr[i]){
                initial =arr[i];
            }
            if(final1<arr[i]){
                final1= arr[i];
            }


        }
        System.out.println(initial);
        System.out.print(final1);
    }
}
