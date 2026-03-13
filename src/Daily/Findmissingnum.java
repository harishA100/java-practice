// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int n = arr.length+1;
        int total = n*(n+1)/2;
        System.out.println(total-sum);
    }
}
