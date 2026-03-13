import java.util.Scanner;
public class DivExcep 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) 
        {
            System.out.println("Div by 0 handled");
        }
        
    }
}
