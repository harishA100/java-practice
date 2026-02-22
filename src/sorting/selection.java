import java.util.*;
class selection{

    public static void select(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp =arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return ;
    }

        
    public static void main(String[] args){
        int arr[]= { 1,5,3,6,8,9,10,4};
        select(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }


}
