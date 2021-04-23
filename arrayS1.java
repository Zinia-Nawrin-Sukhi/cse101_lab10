import java.util.Scanner;

 
public class arrayS1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int myArray[]= new int [10];

        for (int i =0; i < myArray.length ; i++) {
            System.out.print("Type a number: ");
            int number=console.nextInt();
            myArray[i]=number;
        }

        

        System.out.println();
        System.out.println("Your numbers in backward order:");

        for (int i = myArray.length -1; i>= 0  ; i--) {
            System.out.println(myArray[i]);
        }
    }
}