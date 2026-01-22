import java.util.Scanner;
import java.util.Arrays;
class ReverseArray{
    static int[] reverseArray(int[] arr){
        int i=0;int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] arr1 = reverseArray(arr);
        for(int i :arr1){
            System.out.print(i);
        }
    }
}
