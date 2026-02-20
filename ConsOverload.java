public class ConsOverload 
{
    int num1, num2;
    // Default Constructor
    ConsOverload() {
        num1 = 0;
        num2 = 0;
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    ConsOverload(int a) {
        num1 = a;
        num2 = 0;
        System.out.println("One Parameter Constructor Called");
    }

    // Constructor with two parameters
    ConsOverload(int a, int b)
    {
        num1 = a;
        num2 = b;
        System.out.println("Two Parameter Constructor Called");
    }

    void display()
     {
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public static void main(String[] args) 
    {
        // Creating objects using different constructors
        ConsOverload obj1 = new ConsOverload();
        obj1.display();
        ConsOverload obj2 = new ConsOverload(10);
        obj2.display();
        ConsOverload obj3 = new ConsOverload(10, 20);
        obj3.display();
    }
}

