import java.util.*;
class freqchrcount{
    public static void main(String[] args){
        String str1 ="IlovecodingIlovejava";
        String str = str1.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " -> "+entry.getValue());
        }
    }
}
