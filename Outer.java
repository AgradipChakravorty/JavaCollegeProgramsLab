public class Outer 
{
    int x = 10;
    class Inner 
    {
        void display()
        {
            System.out.println("Value of x from outer class = "+x);
        }
    }
     public static void main(String[] args) 
    {
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
    


