import java.util.*;
class Reverseaword{
    public static void main(String[] args){
        StringBuilder s = new StringBuilder();
        String str = "Harish is good boy";
        String[] str1 = str.split(" ");
        for(String word1 : str1){
            StringBuilder word = new StringBuilder(word1);
            s.append(word.reverse()).append(' ');
        }
        System.out.println(s.toString().trim());
    }
}
