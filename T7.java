import java.util.Scanner;
public class T7
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
       
        int[]a=new int[10];
        for(int index=0;index<a.length;index++)
        {
            System.out.println("please enter a number");
            a[index]=sc.nextInt();
        }
            
    
        
        
        for(int index=9;index>=0;index--)
        {
            if(a[index]%2==0)
            {
            System.out.println(a[index]);
      break;
        }
            
          
        }
        }
}
