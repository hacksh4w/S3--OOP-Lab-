// (C) Multiply two given matrices
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int p,q,n,m,i,j;
        int [][]a=new int[30][30];
        int [][]b=new int[30][30];
        System.out.println("Enter the size of First Matrix : ");
        System.out.println("Rows :");
        n=input.nextInt();
        System.out.println("columns: ");
        m=input.nextInt();
        System.out.println("Enter the size of Second Matrix: ");
        System.out.println("Rows:");
        p=input.nextInt();
        System.out.println("columns: ");
        q=input.nextInt();
        if (m!=p){
            System.out.println("Matrix multiplication not possible");
        }
        else {
        System.out.println("First Matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Enter the element: ");
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Second Matrix : ");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                System.out.println("Enter the element: ");
                b[i][j]=input.nextInt();
            }
        }
        int [][]c=new int[30][30];
        int k;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                c[i][j]=0;
                for(k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<q;j++){
                System.out.println(c[i][j]+" ");
            }
        }
         
        }
    }
}

