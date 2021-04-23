import java.util.Scanner;
public class T11
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
       
        int[]a=new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("please enter a number");
            a[i]=sc.nextInt();
        
            for(int j=0;j<=i;j++)
        {
              if(a[i]==a[j])
              {
            System.out.println("duplicated number.");
        }
              break;
        }
           
    }
}
}