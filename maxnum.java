class maxnum {
    int a,b,c;

    maxnum(int n1,int n2,int n3){
        a=n1;
        b=n2;
        c=n3;
    }
    void check() {
        if(a>b && a>c)
            System.out.print(a+"is maxinum");
        else if(b>a && b>c)
            System.out.print(b+"is maximum");
        else
            System.out.print(c+"is maximum");
    }

    public static void main(String[] args) {
        maxnum obj=new maxnum(4,5,6);
        obj.check();
    }
}
