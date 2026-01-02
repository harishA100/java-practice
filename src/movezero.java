import java.util.*;
class movezero{
    public static void movezerotoend(int[] arr){
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int[] arr = {1,2,3,0,4,0,3,0,5};
        movezerotoend(arr);
        for(int num :arr){
            System.out.print(num +" ");
        }
    }
}
