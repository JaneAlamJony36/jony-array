import java.util.Scanner;
public class TransposeMatrix {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int row=input.nextInt();
System.out.println("Enter the number of column:");
int col=input.nextInt();
int[][]arr=new int[row][col];
System.out.println("Enter Array Elements");

for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
    arr[i][j]=input.nextInt();
}
}
System.out.println("Araay Element:=");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
    System.out.print(" "+arr[i][j]);
 }
 System.out.println();  
}
System.out.println("Transpose Matrix:=");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
    System.out.print(" "+arr[j][i]);
 }
 System.out.println();  
}

}
}