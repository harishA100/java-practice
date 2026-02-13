import java.util.*;

class anagram{
    public static void main(String[] args){
        String str1="Liiten";

        String str2="Silent";
        String a=str1.toLowerCase();
        String b=str2.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        if(a.length() != b.length()){
            System.out.println("Not anagram");
            return ;
        }

        
        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
            if(!map.containsKey(ch)){
                System.out.println("Not anagram");
                return ;
            }

            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }


        }

        if(map.isEmpty()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
