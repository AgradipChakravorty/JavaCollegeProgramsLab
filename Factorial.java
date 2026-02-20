import java.util.Scanner;
public class Factorial 
{
    int fact(int x)
    {
        if(x==0)
            return 1;
        else
            return x*fact(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println("Factorial = "+ obj.fact(n));
    }
}
