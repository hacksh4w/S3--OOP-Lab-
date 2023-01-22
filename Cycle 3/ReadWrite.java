// (A) File Handling using reader/writer

import java.util.*;
import java.io.*;
class ReadWrite {
  public static void main(String arg[]) {
    try {
      Reader r = new FileReader("test.txt");
      int ch;
      ch = r.read();
      while (ch != -1) {
        System.out.print((char) ch);
        ch = r.read();
      }
      System.out.println("");
      r.close();
    } catch (Exception e)
       { System.out.println(e); }
    try {
      Writer r = new FileWriter("test.txt");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string to write to file");
      String s = sc.nextLine();
      r.write(s);
      r.close();
      System.out.println("FILE HAS BEEN WRITTEN");
    } catch (Exception e)
   	{ System.out.println(e); }
  }
}
