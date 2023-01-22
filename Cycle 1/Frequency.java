// (B) Find the frequency of a given character in a string

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
         String str;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the string : ");
         str = in.nextLine();
         int len = str.length();
        
         int i,freq = 0;
         System.out.println("Enter the character to be found: ");
         char ch = in.next().charAt(0);
         for(i=0; i<len; i++){
             if(str.charAt(i) == ch){
                 freq++;
             }
         }
         System.out.println(freq +"times");
    }
}
