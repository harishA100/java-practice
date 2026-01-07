import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class primefactor{
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        List<Long> ans = new ArrayList<>();


        long n= sc.nextLong();

        for(long i=2;i*i<=n;i=(i==2?i+1:i+2)){
            if(n%i==0){
                ans.add(i);
            
            while(n%i==0){
                n/=i;
            }
            }
        }
        if(n>1) ans.add(n);
    for(long i : ans){
        System.out.print(i +" ");
    }
    }
}
