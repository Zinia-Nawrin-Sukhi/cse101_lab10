import java.util.Scanner;
    public class Q9
    {
     public static void main(String[] args) 
        {
           int max,min;
            Scanner s = new Scanner(System.in);          
          int a[] = new int[5];     
 
            for(int index = 0; index < 5; index++)
            {
              System.out.println("please enter a number");
                a[index] = s.nextInt();
            }

            max = a[0];min=a[0];
            for(int index = 0; index < 5; index++)
            {
              if(max < a[index])
                {
                max = a[index];
                }
              else
              {
                min=a[index];
              }
            }
 
            System.out.println(max+"with location"+a);
System.out.println(min+"with location"+a);
        }

    }