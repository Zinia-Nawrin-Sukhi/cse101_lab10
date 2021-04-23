import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    int sum=0;
    for(int index=0; index<a.length; index++){
    System.out.println("Please enter a number");
    a[index]=sc.nextInt();
    sum=sum+a[index];
  }
  System.out.println(sum);
  for(int index=0; index<a.length; index++)
  {
    System.out.println(a[index]);
  }
  }
}