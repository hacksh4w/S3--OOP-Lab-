
// (A) Check whether a given string is a palindrome or not.

import java.util.Scanner; 

public class Palindrome {
    public static void main ( String [] args){
        String str, rev ="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = in.nextLine();
        int len = str.length();
        for(int i =len -1; i  >=0; i --){
            rev  += str.charAt(i);
        }
        if (rev.equals(str)){
        System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
