import java.util.Scanner; 
public class Task9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int index=0; index<a.length; index++){
    System.out.println("Please enter a number");
    a[index]=sc.nextInt();
  }
  System.out.println("Please enter another number");
  int  b=sc.nextInt();
  boolean flag=false;
  for(int index=0; index<a.length; index++)
  {  
    if(b==a[index])
    {
     System.out.println("Yes");
     flag=true;
     break;
   }  
  
   }
  if(flag==false){
    System.out.println("No");
   
  }
}
}




