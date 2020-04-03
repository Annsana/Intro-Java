//importing Scanner class which is an external class
import java.util.Scanner;    
public class Main{
    public static void main(String[] args){
    
        //create an object of Scanner class main which will be used to get the input from keyboard
        Scanner main=new Scanner(System.in);
        System.out.println("Enter the number");
        
        int num = main.nextInt();  //Method for reading Integer
        
        //To check whether odd or even
        if (num % 2 == 0)
        {
            System.out.println(num+" is even");
        }
        
        else
        {
            System.out.println(num+" is odd");
        }
        
   
    }
}
