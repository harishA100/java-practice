import java.util.*;
class countprimes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        boolean arr[] = new boolean[n+1];
        for(int i =0;i<=n;i++){
            arr[i]=true;
        }
        for(int j=2;j*j<=n;j++){
            if(arr[j]){
                for(int mul=j*j;mul<=n;mul+=j){
                    arr[mul]=false;
                }
            }
        }
        int count =0;
        for(int i=2;i<=n;i++){
            if(arr[i]){
                count++;
            }
        }

            System.out.print(count);
            }
        }
    
    