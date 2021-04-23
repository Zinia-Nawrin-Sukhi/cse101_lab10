import java.util.Scanner;
 public class arrayS2 {

   public static void main(String[] args) 
  {
     Scanner sc =new Scanner(System.in);
    int[] array = new int[20];
    for ( int i=0; i<array.length; i++ )
    {
        int temp = array[i];
        array[i] = array[array.length-(1+i)];
        array[array.length-(1+i)] = temp;
    }
    System.out.println("Array after reverse: \n" + Arrays.toString(array));

     int even=0;
     
     int[] Even = new int[13];
 
    for ( int i=0; i<array.length; i++)
    {
        if (array[i] % 2 == 0)
        {
            Even[i] = array[i];
            even++;
        }
       
    }
  System.out.println("Even: "+even+" ");
   }}