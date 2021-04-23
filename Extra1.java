import java.util.Scanner;
public class Extra1
{
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
      
    int a[]=new int[10];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("please enter a number");
      a[i]=s.nextInt();
    }
    for(int i=9;i<a.length;i--)
    {
      System.out.println(a[i]+" "+i);
    }
  }
}
