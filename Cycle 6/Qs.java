// (B) Implement Quick Sort of list of names
import java.lang.*;
import java.util.*;
import java.io.*;

public class Qs{  
String names[];
int len;
public  static void main(String[] args){
	Qs obj = new Qs();
	int n;  
    Scanner sc=new Scanner(System.in); 
	System.out.println("Enter number of Names \n");
	n = sc.nextInt();
	n = n+1;  //when enter key is pressed on names, enter key for nth element triggers the for loop before element is entered
	String strlst[] = new String[n];
	System.out.println("Enter the Names");
	for (int k = 0; k< n; k++){
	    strlst[k] = sc.nextLine();
	}
	obj.sort(strlst,n);
		
	for (String i : strlst){
		System.out.print(i);
		System.out.print(" ");
		}
	}
	
void sort(String strlst[], int n) {
        if (strlst == null || n == 0) {
            return;
        }
        this.names = strlst;
        this.len = n;
        quickSort(strlst,0, len - 1);
    }

void quickSort (String strlst[],int li, int hi){
	int i = li;
	int j = hi;
	String pivot = this.names[li+(hi - li)/2];
	while (i <=j ){
		while (this.names[i].compareToIgnoreCase(pivot) < 0 ) {
		 i++;
	}
		while (this.names[j].compareToIgnoreCase(pivot) > 0 ) {
		j--;	
}
		if (i <= j){
			exchangeNames(i,j);
			i++;
			j--;
}
}
	if ( li< j){
	quickSort(strlst,li,j);
	}
	if (i <hi){
	quickSort(strlst,i,hi);
	}
}
void exchangeNames (int i,int j){
	String temp = this.names[i];
	this.names[i] = this.names[j];
	this.names[j] = temp;
}
}
