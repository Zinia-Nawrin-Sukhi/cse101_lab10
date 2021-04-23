import java.util.Scanner;
public class Extra2
{
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    int evensum=0;
    int oddsum=0;
    int div5sum=0;
    int a[]=new int[6];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("please enter a number");
      a[i]=s.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
      if(a[i]%2==0)
      {
        evensum=a[i]+evensum;
      }
      else
      {
        oddsum=oddsum+a[i];
      }
      if(a[i]%5==0)
      {
       div5sum=div5sum+a[i]; 
      }
    }
    System.out.println(evensum);
    System.out.println(oddsum);
    System.out.println(div5sum);
  }
}
