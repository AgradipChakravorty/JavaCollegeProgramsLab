class leapyear {
    int year;

    leapyear(int y){
        year=y;
    }
    void check() {
      if(year%4==0 && year%100!=0  &&year%400==0)
        System.out.print(year +"is a leap year");
      else
        System.out.print(year +"is not a leap year");
    }

    public static void main(String[]args){

        leapyear obj=new leapyear(2025);
        obj.check();
    }
}
