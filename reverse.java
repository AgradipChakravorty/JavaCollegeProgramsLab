class reverse {
    int num=1234;

    void reversenum()
    {
        int dig,rev=0;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        System.out.println("Reverse number is:"+rev);

    }
    public static void main(String[]args){
        reverse obj=new reverse();
        obj.reversenum();
    }
}
