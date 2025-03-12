import java.util.Scanner;
public class ArraySum {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of rows");
int row=input.nextInt();
System.out.println("Enter the number of cols");
int col=input.nextInt();
int[][]arr=new int[row][col];
int sum=0;
System.out.println("Enter Array Elements");

for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
    arr[i][j]=input.nextInt();
    sum+=arr[i][j];
}
}
System.out.println("sum of Araay Element:="+sum);


}
}