import java.util.*;
class Frequency{
    static int[] frequencycount(String s){
        int[] arr = new int[26];
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            arr[ch -'a']++;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        int[] arr1= frequencycount(s);
        for(int i=0;i<26;i++){
            System.out.println((char)(i+'a') + "->"+arr1[i]);
        }
    }
}