import java.util.*; 
public class Qs{   //Quick sort for strings
String names[];
int len;

void sort(String arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }
        this.names = arr;
        this.len = arr.length;
        quickSort(0, len - 1);
    }
void quickSort (int li, int hi){
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
	quickSort(li,j);
	}
	if (i <hi){
	quickSort(i,hi);
	}
}
void exchangeNames (int i,int j){
	String temp = this.names[i];
	this.names[i] = this.names[j];
	this.names[j] = temp;
}
public  static void main(String[] args){
	Qs obj = new Qs();
	String strlst[] = {"Jay","Ray","Chase","Al","Jace","Alex"};
	obj.sort(strlst);
		
	for (String i : strlst){
		System.out.print(i);
		System.out.print(" ");
		}
	}

}
