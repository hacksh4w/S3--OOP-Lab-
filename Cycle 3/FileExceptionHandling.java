// (B) File Operations by handling all file related exceptions
import java.io.*;
import java.util.Scanner;
class FileExceptionHandling {
  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("text.txt");
      int ch;
      while ((ch = fin.read()) != -1) {
        System.out.print((char) ch);
      }
      fin.close();
      System.out.println("\nFinished!");
    } catch (FileNotFoundException e) {
      System.out.println("File missing: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error Caught: " + e.getMessage());
    }
    try {
      FileOutputStream f = new FileOutputStream("texts.txt");
      String s;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter data");
      s = in.nextLine();
      byte b[] = s.getBytes();
      f.write(b);
      f.close();
      System.out.println("Written Successfully");
    } catch (FileNotFoundException e) {
      System.out.println("Error Caught: " + e);
    } catch (IOException e) {
      System.out.println("Error Caught: " + e);
    }
  }
}
