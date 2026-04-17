import java.util.Scanner;
public class AbsPro {
    public static void main(String[] args) {
        Product p = new Product();
        Book b = new Book();
        CompactDisc cd = new CompactDisc();
        TravelGuide tg = new TravelGuide();
        p.Product_ID();
        b.Product_ID();
        cd.Product_ID();
        tg.Product_ID();
    }
    
}

abstract class AbstractProduct
{
    String name = "";
    String desc = "";
    abstract void Product_ID();
}

class Product extends AbstractProduct
{
    double price;
     @Override
    void Product_ID()
     {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
         name = sc.nextLine();
        System.out.println("Enter description");
        desc = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextDouble();
        System.out.println("Name = "+name);
        System.out.println("Description = "+desc);
        System.out.println("Price = "+price);
    }
}

class Book extends Product
{
    String isbn="";
    String author = "";
    String title = "";

    @Override
    void Product_ID() {
        super.Product_ID();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Author");
         author = sc.nextLine();
        System.out.println("Enter title");
        title = sc.nextLine();
        System.out.println("Enter isbn");
        isbn = sc.nextLine();
        System.out.println("Author = "+author);
        System.out.println("Title = "+title);
        System.out.println("ISBN = "+isbn);
    }
}

class CompactDisc extends Product
{
    String artist = "";
    String tit = "";
    @Override
    void Product_ID()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Author");
        artist = sc.nextLine();
        System.out.println("Enter title");
        tit = sc.nextLine();
        System.out.println("Artist = "+artist);
        System.out.println("Title = "+tit);
    }
}

class TravelGuide extends Product
{
    String country = "";
    @Override
    void Product_ID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country");
        country = sc.nextLine();
        System.out.println("Country = " +country);
    }
        
}
