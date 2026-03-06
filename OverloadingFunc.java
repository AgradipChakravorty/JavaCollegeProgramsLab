public class OverloadingFunc {
     int area(int a, int b)
     {
        return a*b;
     }   
     int area(int a)
     {
        return a*a*a;
     } 
     public static void main(String[] args) {
        OverloadingFunc obj = new OverloadingFunc();
        System.out.println("AREA OF RECTANGLE = "+obj.area(5));
        System.out.println("AREA OF SQUARE = "+obj.area(5, 6));
     }
}
