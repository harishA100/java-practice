// You are using Java
import java.util.*;
class Freqcount{
    public static void main(String[] args){
        String s1 = "java programming";
        String s = s1.replaceAll("\\s","");
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();
        
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
    }
}

