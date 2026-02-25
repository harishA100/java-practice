import java.util.*;
class insertion{
    public static void main(String[] args){
        int arr[]={5,3,2,1,7,4,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            
        int j=i;
        while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                }
                
                
            
        }
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
