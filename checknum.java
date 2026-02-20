class checknum{
    int n;

    checknum(int num){
        n=num;
    }
    void check() {
    if(n<0)
    {
        System.out.print("It is a negative number!");
    }
     System.out.print("It is a positive number!");
}
     public static void main(String[]args)
     {
        checknum obj=new checknum(4);
        obj.check();
     }
    }