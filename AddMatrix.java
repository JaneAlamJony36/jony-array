import java.util.Scanner;
public class AddMatrix {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
 
System.out.println("Enter the number of rows of first Matrix:");
int row=input.nextInt();
System.out.println("Enter the number of column of first matrix:");
int col=input.nextInt();
int[][]m=new int[row][col];
System.out.println("Enter Array Elements of first Matrix");

for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
    m[i][j]=input.nextInt();
}
}
System.out.println("Enter the number of rows of second Matrix:");
int row2=input.nextInt();
System.out.println("Enter the number of column of second matrix:");
int col2=input.nextInt();
int[][]n=new int[row][col];
System.out.println("Enter Array Elements of Second Matrix");

for(int i=0;i<row2;i++){
   for(int j=0;j<col2;j++){
    n[i][j]=input.nextInt();
}
}
int[][]k=new int[row][col];
System.out.println("Addition of two Matrix:=");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
k[i][j]=m[i][j]+n[i][j];
    System.out.print(" "+k[i][j]);
 }
 System.out.println();  
}

}
}