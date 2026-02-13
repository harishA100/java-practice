import java.util.*;
class freqwordcount{
    public static void main(String[] args){
        String str1 ="I love coding I love java";
        String str = str1.toLowerCase();
        HashMap<String,Integer> map = new HashMap<>();
         String[] words = str.split(" ");
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> "+entry.getValue());
        }
    
    }
}
