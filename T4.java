import java.util.Scanner;
public class T4
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
       
        int[]a=new int[3];
        for(int index=0;index<a.length;index++)
        {
            System.out.println("please enter a number");
            a[index]=sc.nextInt();
            
    
        
       
            if(a[index]%2!=0)
            {
            System.out.println(a[index]);
        }
            break;
        }
        }
   
}