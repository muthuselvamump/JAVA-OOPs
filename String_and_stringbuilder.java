import java.util.Arrays;

public class String_and_stringbuilder {
    public static void main(String[] args) {
        String s1="hello";
        String s5="    hello world java jsp    ";
        String s2="hello";
        System.out.println(s1==s2);
        String s3=new String("hello");
        String s4=new String("hello");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(Arrays.toString(s5.toCharArray()));
        System.out.println(s5.indexOf("w"));
        System.out.println(s5.strip());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(0));
        System.out.println(s5.substring(7));
        System.out.println(s5.substring(7,15));
        System.out.println(s5.lastIndexOf("j"));
        System.out.println(Arrays.toString(s5.split("e")));//split array


        for(int i=0;i<26;i++){
            System.out.print((char)('a'+i)+ " ");
        }
        System.out.println();
        for(int i=0;i<26;i++){
            System.out.print((char)('A'+i)+ " ");
        }

        System.out.println();

        String con="";
         for(int i=0;i<26;i++){
            con+=(char)('a'+i);//every time new object creat time complexity also n^2 (n sqaure)
        }
        System.out.println("---->" +con) ;

        StringBuilder str=new StringBuilder();
         for(int i=0;i<26;i++){
            str.append((char)('a'+i)); // no new object create every time time complexity also o(n)
           }
           System.out.println(str.toString());
           
        

    }
    
}
