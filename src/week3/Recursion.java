import java.util.Scanner;
class Recursion{

   static int Fact(int n){
        if(n==0) return 1;
        return n*Fact(n-1);
   }
   static int Arrsum(int[] arr1, int n){
    if(n==0) return 0 ;
    return  arr1[n-1]+Arrsum(arr1,n-1);


   }
   static void print1toN(int n) {
    if (n == 0) return;
    print1toN(n - 1);
    System.out.print(n + " ");
}
    static void printNto1(int n){
        if(n==0) return ;
        System.out.print(n+ " ");
        printNto1(n-1);

    
    }
    static int printSumOfN(int n){
        
        if(n==0) return 0 ;
        
        return n + printSumOfN(n-1);

    }
    static int countOfDigits(int n){
        if(n<1)  return 0;
        return 1+countOfDigits(n/10);
    }

    static int revNumber(int n, int rev){
        if(n==0) return rev;
        return revNumber(n/10, rev*10+n%10);

    }

    static boolean isPalindrome(int n){
            return n==revNumber(n,0);
       }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int result = Fact(n);
        int[] arr={3,5,4,6};
        int a=arr.length;
        int sum = Arrsum(arr,a);
        System.out.println(result);
        System.out.println(sum);
        print1toN(a);
        System.out.println();
        printNto1(a);
        System.out.println();
        System.out.println(printSumOfN(a));
        int reve =0;
        System.out.print(revNumber(1234556, reve));
        System.out.println();
        
        if(isPalindrome(12332)){
            System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

