import java.util.*;
class frequency{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            System.out.println((char)(i + 'a') +"-> "+ arr[i]);
        }
    }
}