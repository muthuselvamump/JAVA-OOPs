import java.util.*;
public class remove_vowels_in_string2 {
    public static void main(String []args){
        System.out.println("Enter string");
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                continue;
            }
            s1 +=s.charAt(i);
        }
        System.out.println(s1);
    }
    
}
