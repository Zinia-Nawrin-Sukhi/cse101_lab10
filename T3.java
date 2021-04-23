import java.util.Scanner;
public class T3
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
       
        int[]a=new int[10];
        for(int index=0;index<a.length;index++)
        {
            System.out.println("please enter a number");
            a[index]=sc.nextInt();
            
        }
       
        for(int index=9;index<a.length;index--)
        {
            System.out.println(a[index]);
        }
    }
}