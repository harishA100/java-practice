import java.util.*;
class nonrepeatchar{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        int n = s.length();
        boolean found = false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
           boolean isrepeated= false;

            for(int j=0;j<n;j++){
                if(i!=j&& ch == s.charAt(j)){
                    isrepeated=true;
                    break;
                }
            }
        
        if(!isrepeated){
            System.out.print("The Non repeated character is: "+ ch);
            found =true;
            break;
        }
        }

        if(!found){
            System.out.print("-1");
        }
        }
    }
