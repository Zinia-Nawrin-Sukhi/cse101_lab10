import java.util.Scanner;
public class Q1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int []a=new int[3];
    for(int index=0;index<a.length;index++)
    {
      System.out.println("please enter a number");
      a[index]=sc.nextInt();
      sum=sum+a[index];
  }
   System.out.println(sum); 
   for(int index=0;index<a .length;index++)
   {     
       System.out.println(a[index]); 
   }
  }
}