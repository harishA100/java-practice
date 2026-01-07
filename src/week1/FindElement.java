import java.util.*;
class FindElement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter a target element : ");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    if(arr[i]+arr[j]==target){
                        System.out.println("The pair is : "+ arr[i] +" , " +arr[j]);
                    }
                    
                }
            }
        }
    }
}