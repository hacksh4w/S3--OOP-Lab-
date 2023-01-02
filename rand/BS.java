import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
  {
   public static void main(String args[])
   {
      int count, num, item, array[], first, last, middle;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = in.nextInt(); 
      array = new int[num];

      System.out.println("Enter " + num + " integers");
      for (count = 0; count < num; count++)
       {   array[count] = in.nextInt();}
      Arrays.sort(array);
      System.out.println("Sorted array is");
      for (int element: array) {
          
            System.out.println(element);}
      System.out.println("Enter the search value:");
      item = in.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}
