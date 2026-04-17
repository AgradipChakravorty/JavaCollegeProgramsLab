public class Driver {
    public static void main(String[] args) {
         CarHat obj = new CarHat("BMW", 154, 3000);
        obj.display();
    }
   
    
}

abstract class MotorVehicle
{
    String modelName;
    int modelNo, modelPrice;
    abstract void display();
}

class CarHat extends MotorVehicle
{
    public CarHat(String modelname, int modelno, int modelpr)
    {
        this.modelName = modelname;
        this.modelNo = modelno;
        this.modelPrice = modelpr;
    }

    @Override
     void display()
    {
         System.out.println("Model name = "+modelName);
         System.out.println("Model Number = "+modelNo);
         System.out.println("Model Price = "+modelPrice);

    }
}
