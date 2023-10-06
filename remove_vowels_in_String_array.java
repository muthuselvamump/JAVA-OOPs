import java.util.*;
public class remove_vowels_in_String_array {
    public static void main(String []args){
        System.out.println("Enter Array Length");
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();
        scan.nextLine();
        String []str=new String[len];
        for(int i=0;i<len;i++){
            str[i]=scan.nextLine();
        }

       // String []str={"welcome","helloworld","javadeveloper"};
        String []str1=new String[len];
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i' || str[i].charAt(j)=='o' || str[i].charAt(j)=='u'){
                    continue;
                }
                str1[i] +=str[i].charAt(j);
                //System.out.println(str[i].charAt(j));
            }
        }
        for(String k:str1){
            System.out.println(k);
        }
    }
    
}
