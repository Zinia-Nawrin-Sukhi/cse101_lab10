import java.util.Scanner;
public class Q6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    int []a=new int[10];
    for(int index=0;index<a.length;index++)
    {
      System.out.println("please enter a number");
      a[index]=sc.nextInt();
      if(a[index]%2==0 && index==a.length-1)
      {
        System.out.println(a[index]);
      }
   
  
      }
    }
  }
