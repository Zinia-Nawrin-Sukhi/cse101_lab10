import java.util.Scanner;
public class T9
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
       
        int[]a=new int[10];
        for(int index=0;index<a.length;index++)
        {
            System.out.println("please enter a number");
            a[index]=sc.nextInt();
        }
             
        System.out.println("please enter a number");
        int b=sc.nextInt();
        int flag=0;
        for(int index=0;index<a.length;index++)
        {
           
        if(b==a[index])
        {
         System.out.println("yes");
         flag=1;
        break;
        }
      if(flag==0)
      {
            System.out.println("no");
           
        }
    }
}
}