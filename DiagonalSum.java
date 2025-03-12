import java.util.Scanner;
public class DiagonalSum {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int maindiagonalsum=0,secondarydiagonalsum=0;
System.out.println("Enter the size of Matrix:");
int size=input.nextInt();
int[][]arr=new int[size][size];
System.out.println("Enter Array Elements");

for(int i=0;i<size;i++){
   for(int j=0;j<size;j++){
    arr[i][j]=input.nextInt();
}
}
for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
    if(i==j){
        maindiagonalsum+=arr[i][j];
    }
 }
}
 System.out.println("The main Diagonal Sum="+maindiagonalsum);  
 for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
    if(i+j==size-1){
        secondarydiagonalsum+=arr[i][j];
    }
 }
}
System.out.println("The Secondary Diagonal Sum="+secondarydiagonalsum); 
}
}