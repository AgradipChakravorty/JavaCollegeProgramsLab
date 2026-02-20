 class swapnum {
    int a,b;

    swapnum(int n1,int n2){
        a=n1;
        b=n2;
    }

    void swap()
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.print("After swapping:\n");
        System.out.print("a:"+a+"\n");  
        System.out.print("b:"+b+"\n");  
    }


    public static void main(String[] args) {
        swapnum obj1=new swapnum(20,30);
        swapnum obj2=new swapnum(10,2);
        obj1.swap();
        obj2.swap();
    }
}
