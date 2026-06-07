import java.util.*;
class Count_Distinct_Element{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }
    }
}