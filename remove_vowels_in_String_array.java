public class remove_vowels_in_String_array {
    public static void main(String []args){
        String []str={"welcome","helloworld","javadeveloper"};
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                System.out.println(str[i].charAt(j));
            }
        }
    }
    
}
